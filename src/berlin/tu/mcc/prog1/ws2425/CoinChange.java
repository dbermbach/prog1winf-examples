package berlin.tu.mcc.prog1.ws2425;

import Prog1Tools.IOTools;

public class CoinChange {



    public static void main(String[] args) {
        double[] coins = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2};
        double amount = IOTools.readDouble("For which amount shall we calculate the change:");
        double rest = amount;
        for(int i = coins.length-1;i>=0;i--){
            int noOfCoins =0;
            while(rest>=coins[i]){
                rest -=coins[i];
                noOfCoins++;
            }
            System.out.println(noOfCoins+"x"+coins[i]+ "EUR");
        }
    }

}
