package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    /*
     * nombre, edad, hijos
     */
    private String[][] people;
    private Scanner  keyboard;
    private File file;

    public Main() {
        this.keyboard = new Scanner(System.in); 
        this.people = new String[5][3];
        this.file = new File("./parcial.txt");
        this.addPeople();
    }
    public static void main(String[] args) throws IOException {
        Main data = new Main();

        data.writeFile();
        data.print();
    }

    private void addPeople() {
        System.out.println("Escriba los datos:");

        for (int i = 0; i < people.length; i++) {
            System.out.println("Escribe el nombre de la persona numero " + (i+1) + ": ");
            String name = keyboard.next();
            System.out.println("Escribe la edad");
            String age = getNumber().toString();
            System.out.println("Escribe la cantidad de hijos");
            String sons = getNumber().toString();

            this.people[i] = new String[]{name, age, sons};
        }
    }

    private Integer getNumber() {
        try {
            return Integer.parseInt(keyboard.next());
        } catch (NumberFormatException e) {
            System.out.println("numero no valido intente de nuevo");
            return getNumber();
        }
    }

    public void writeFile() throws IOException {
        FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
        PrintWriter printer = new PrintWriter(writer);

        printer.write(String.format("|%15s|%3s|%2s|\n", "nombre", "edad", "hijos"));        

        for (String[] person : people) {
            printer.write(String.format("|%15s|%3s|%2s|\n", person[0], person[1], person[2]));    
        }

        printer.close();
    }
    public void print() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String data = reader.readLine();

        while (data != null) {
            System.out.println(data);
            data = reader.readLine();
        }
        reader.close();
    }
}