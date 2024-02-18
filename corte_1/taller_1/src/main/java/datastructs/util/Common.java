package datastructs.util;

import java.util.Scanner;

public class Common {
  public static void ClearConsole() {
    try {
      final String os = System.getProperty("os.name");
      if (os.contains("Windows")) {
        Runtime.getRuntime().exec("cls");
      } else {
        Runtime.getRuntime().exec("clear");
      }
    } catch (final Exception e) {}
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
