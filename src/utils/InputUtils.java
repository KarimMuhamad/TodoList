package utils;

import java.util.Scanner;

public class InputUtils {
  private static Scanner scanner = new Scanner(System.in);

  public static String userInput(String message) {
    System.out.print(message);
    return scanner.nextLine();
  }
}
