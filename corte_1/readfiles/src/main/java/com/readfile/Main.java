package com.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Scanner;

import lombok.SneakyThrows;

public class Main {
  private Scanner keyboard;
  private File file;

  public Main() {
    this.keyboard = new Scanner(System.in);
    System.out.println("Escribe los datos de la siguiente forma: cc-nombre-detalle");

    Path cwd = getCwd();
    Path fileDir = Paths.get(cwd.toString(), "data.csv");
    File file = new File(fileDir.toString());

    if (file.isDirectory()) {
      System.out.println(cwd + ", es un directorio");
      return;
    }
    
    this.file = file;

    if (file.exists()) {
      System.out.println("El archivo ya existe, desea eliminarlo [Y/N]: ");
      String response = this.keyboard.nextLine();

      if (response.trim().toLowerCase().equals("n")) {
        this.readAndPrint();
        System.out.println("adios!");
        System.exit(0);
        return;
      }

      if (!response.trim().toLowerCase().equals("y")) {
        System.out.println("Valor no valido");
        System.exit(1);
        return;
      }

      file.delete();
    }
  }

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    try {
      FileWriter fileWriter = new FileWriter(file);
      PrintWriter printer = new PrintWriter(fileWriter);

      printer.println("cc;name;detail");
      
      System.out.println("Para terminar la lista escribe stop");
      System.out.println("el formato es: cc-nombre-detalle");

      while (true) {
        String data = keyboard.nextLine();
        
        if (data.trim().toLowerCase().equals("stop")) {
          break;
        }

        Person person = parsePerson(data);
        printer.println(person.getCc() + ";" + person.getName() + ";" + person.getDetail());
      }
      
      printer.close();
    } catch (IOException e) {
      System.out.println("No se puede wescribir sobre el archivo " + file.getPath());
    }
  }

  @SneakyThrows
  private void readAndPrint() {
    FileReader file = new FileReader(this.file);
    BufferedReader reader = new BufferedReader(file);
    Integer line = 1;
    String lineData = reader.readLine() ;
    
    while (lineData != null) {
      System.out.printf("%3d| %s \n", line, lineData);
      line ++;
      lineData = reader.readLine();
    }

    reader.close();
  }

  private Person parsePerson(String data) {
    try {
      return Person.parse(data);
    } catch (ParseException e) {
      System.out.println(e.getMessage() + ", intente de nuevo");
      return parsePerson();
    }
  }
  
  private Person parsePerson() {
    String data = keyboard.nextLine();
    
    try {
      return Person.parse(data);
    } catch (ParseException e) {
      System.out.println(e.getMessage() + ", intente de nuevo");
      return parsePerson();
    }
  }

  private Path getCwd() {
    String cwd = System.getProperty("user.dir");
    return Paths.get(cwd);
  }
}