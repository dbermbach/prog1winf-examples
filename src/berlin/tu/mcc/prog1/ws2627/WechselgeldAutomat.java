package berlin.tu.mcc.prog1.ws2627;

import Prog1Tools.IOTools;

public class WechselgeldAutomat {

    public static void main(String[] args) {
        int[][] muenzen = {{1, 11111111}, {2, 111}, {5, 15}, {10, 0}, {20, 5}, {50, 4}, {100, 8}, {200, 40}};
        for(int[] eintrag: muenzen){
            System.out.println(eintrag[0]+ " Cent gibt es " + eintrag[1] + " mal.");
        }
        long wechselgeldInCent = IOTools.readLong("Bitte Wechselgeldsumme in Cent eingeben:");
        System.out.println("Gewünschte Wechselgeldsumme " + (wechselgeldInCent/100.0)+ "EUR");
        long rest = wechselgeldInCent;
        for(int i = muenzen.length-1;i>=0;i--){
            long tmp = rest/muenzen[i][0];
            tmp = Math.min(tmp,muenzen[i][1]);
            System.out.println(tmp + " x " + muenzen[i][0] + "(entspricht "+ (tmp*muenzen[i][0]/100.0)+ "EUR)");
            rest -= tmp*muenzen[i][0];
        }
        if(rest>0){
            System.out.println("Es konnten " + (rest/100.0) + " EUR nicht herausgegeben werden.");
        } else {
            System.out.println("Es konnte vollständig herausgegeben werden.");
        }

    }
}
