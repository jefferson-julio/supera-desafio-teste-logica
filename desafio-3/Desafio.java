import java.util.Arrays;
import java.util.Scanner;

class Desafio {

  public static void main(String[] args) {
    int targetValue, arraySize = 0;
    var scanner = new Scanner(System.in);

    var firstInputLine = scanner.nextLine();
    var firstInputLineSplit = firstInputLine.split("\\s");

    if (firstInputLineSplit.length < 2) {
      System.out.println("Números insuficientes.");
      System.exit(1);
    }

    arraySize = Integer.parseInt(firstInputLineSplit[0]);
    targetValue = Integer.parseInt(firstInputLineSplit[1]);
    int[] arr = new int[arraySize];

    var secondInputLine = scanner.nextLine();
    var secondInputLineSplit = secondInputLine.split("\\s");

    if (secondInputLineSplit.length < arraySize) {
      System.out.println("Números insuficientes. É esperado " + arraySize + " números.");
      System.exit(1);
    }

    for (int i = 0; i < arraySize; i++) {
      arr[i] = Integer.parseInt(secondInputLineSplit[i]);
    }

    Arrays.sort(arr);

    int validPairs = 0;

    for (var i : arr) {
      for (var j : arr) {
        if (i == j) continue;

        if (i - j == targetValue) {
          validPairs++;
        }
      }
    }

    System.out.println(validPairs);

    scanner.close();
  }

}
