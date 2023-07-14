import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Desafio {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var linesCount = scanner.nextInt();

    if (linesCount <= 0) {
      System.out.println("O números de linhas deve ser positivo maior que zero!");
      System.exit(1);
    }

    if (linesCount > Math.pow(10, 5)) {
      System.out.println("O número de linhas é muito grande.");
      System.exit(1);
    }

    var oddNumbers = new ArrayList<Integer>(Arrays.asList());
    var evenNumbers = new ArrayList<Integer>(Arrays.asList());

    int number = 0;
    for (var i = 0; i < linesCount; i++) {
      try {
        number = scanner.nextInt();
      } catch (java.util.NoSuchElementException e) {
        System.out.println("Números insuficientes");
        System.exit(1);
      }

      if (number % 2 == 0) {
        evenNumbers.add(number);
      } else {
        oddNumbers.add(number);
      }
    }

    scanner.close();

    evenNumbers.sort((arg0, arg1) -> arg0 > arg1 ? 1 : -1);
    oddNumbers.sort(((arg0, arg1) -> arg0 < arg1 ? 1 : -1));

    evenNumbers.forEach(i -> System.out.println(i));
    oddNumbers.forEach(i -> System.out.println(i));
  }

}
