package datastructs.util;

import java.util.Scanner;

public class Common {
  public static void ClearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static Integer getInteger(Scanner sc) {
    String val = sc.nextLine();

    try {
      return Integer.parseInt(val);
    } catch (NumberFormatException e) {
      System.out.println(val + " no es un numero intente de nuevo");
      return getInteger(sc);
    }
  }
}
