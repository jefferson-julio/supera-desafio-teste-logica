import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Desafio {

  public static void main(String[] args) {
    double[] validBallots = {100, 50, 20, 10, 5, 2};
    double[] validCoins = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
    double moneyInput = 0.0;

    var scanner = new Scanner(System.in).useLocale(java.util.Locale.US);
    moneyInput = scanner.nextDouble();
    scanner.close();

    var decomposedBallots = new ArrayList<double[]>(Arrays.asList());
    var decomposedCoins = new ArrayList<double[]>(Arrays.asList());
    double decomposedItemCount = 0;

    for (var ballot : validBallots) {

      if (ballot <= moneyInput) {
        decomposedItemCount = Math.floor(moneyInput / ballot);
        decomposedBallots.add(new double[]{decomposedItemCount, ballot});
        moneyInput -= decomposedItemCount * ballot;
        continue;
      }

      decomposedBallots.add(new double[]{0, ballot});
    }

    for (var coin : validCoins) {

      if (coin <= moneyInput) {
        decomposedItemCount = Math.floor(moneyInput / coin);
        decomposedCoins.add(new double[]{decomposedItemCount, coin});
        moneyInput -= decomposedItemCount * coin;
        continue;
      } 

      decomposedCoins.add(new double[]{0, coin});

    }

    if (decomposedBallots.size() > 0) {
      System.out.println("NOTAS:");
      for (var decomposedBallot : decomposedBallots) {
        System.out.printf("%d nota(s) de R$ %.2f\n", (int) decomposedBallot[0], decomposedBallot[1]);
      }
    }

    if (decomposedCoins.size() > 0) {
      System.out.println("MOEDAS:");
      for (var decomposedCoin : decomposedCoins) {
        System.out.printf("%d moeda(s) de R$ %.2f\n", (int) decomposedCoin[0], decomposedCoin[1]);
      }
    }
  }

}
