package berlin.tu.mcc.prog1.ws2526;

import Prog1Tools.IOTools;

public class Addierer {

    public static void main(String[] args) {
        int zahl1 = IOTools.readInt("bitte Zahl 1 eingeben:");
        int zahl2 = IOTools.readInt("bitte Zahl 2 eingeben:");
        System.out.println("Die Summe von " + zahl1 + " und " + zahl2 + " ist " + (zahl1 + zahl2));
    }

}
