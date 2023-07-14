import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var linesCount = scanner.nextInt();

    if (linesCount <= 0) {
      System.out.println("O número de linhas deve ser positivo e maior que zero!");
      System.exit(1);
    }

    String decryptedLines = "";
    String currentLine = "";
    var stringBuilder = new StringBuilder();

    for (int i = 0; i <= linesCount; i++) {
      currentLine = scanner.nextLine();

      stringBuilder.append(currentLine.substring(0, currentLine.length() / 2));
      stringBuilder.reverse();
      var firstHalf = stringBuilder.toString();
      stringBuilder.delete(0, currentLine.length() / 2);

      stringBuilder.append(currentLine.substring(currentLine.length() / 2, currentLine.length()));
      stringBuilder.reverse();
      var secondHalf = stringBuilder.toString();
      stringBuilder.delete(0, currentLine.length() / 2);

      decryptedLines += firstHalf + secondHalf + "\n";
    }

    System.out.println(decryptedLines);

    scanner.close();
  }

}
