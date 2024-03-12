package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    if (args.length < 1 || args[0] == null) throw new Exception("No se paso una direccion valida");

    Path cwd = getCwd();
    File filePath = Paths.get(cwd.toString(), args[0]).toFile();
    
    System.out.println(Arrays.toString(args));

    if (filePath.isDirectory()) {
      System.out.println(filePath + " is a directory");
      return;
    }
    if (filePath.exists()) {
      readAndPrint(filePath);
      return;
    }

    makeFile(filePath);
  }

  private static void readAndPrint(File file) throws FileNotFoundException {
    Scanner reader = new  Scanner(file);
    Integer line = 1;
    
    while (reader.hasNextLine()) {
      System.out.printf("%3d| %s \n", line, reader.nextLine());
      line ++;
    }

    reader.close();
  }

  private static void makeFile(File file) throws IOException {
    FileWriter writer = new FileWriter(file);
    PrintWriter data = new PrintWriter(writer);
    Scanner sc = new Scanner(System.in);

    System.out.println("Eescrive stop para terminar de escrivir");
    Integer counter = 0;
    String lastLine = "";
    

    while (!lastLine.trim().toLowerCase().equals("stop")) {
      counter ++;
      System.out.printf("%3d| ", counter);
      lastLine = sc.nextLine();
      data.println(lastLine);
    }

    data.close();
    sc.close();
  } 

  private static Path getCwd() {
    String cwd = System.getProperty("user.dir");
    return Paths.get(cwd);
  }
}