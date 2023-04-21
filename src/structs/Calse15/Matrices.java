package structs.Calse15;

import java.util.Scanner;

public class Matrices {
  Scanner sc;
  Integer[][] matrix;

  public Matrices() {
    this.sc = new Scanner(System.in);
    int x, y;

    System.out.print("How many colunms has the matrix: ");
    x = sc.nextInt();
    
    System.out.print("How many rows has the matrix: ");
    y = sc.nextInt();

    this.matrix = new Integer[x][y];
  }

  public void cargar() {
    for (int i = 0; i < this.matrix.length; i++) {
      for (int j = 0; j < this.matrix[i].length; j++) {
        System.out.printf("Ingrese el numero para la posicion %d,%d: ", i , j);
        this.matrix[i][j] = sc.nextInt();
      }
    }
  }

  public void print() {
    for (int i = 0; i < this.matrix.length; i++) {
      for (int j = 0; j < this.matrix[i].length; j++) {
        System.out.printf("%2d ", this.matrix[i][j]);
      }
      System.out.println();
    }
  }

  public void printLastRow() {
    System.out.println("Last row: ");
    for (int j = 0; j < matrix[matrix.length - 1].length; j++) {
      System.out.printf("%2d ", matrix[matrix.length - 1][j]);
    }
  }

  public static void main(String[] args) {
    Matrices mtr = new Matrices();
    mtr.cargar();
    mtr.print();
    mtr.printLastRow();
  }
}
