package berlin.tu.mcc.prog1.ws2324.graph;

import java.util.ArrayList;
import java.util.List;

public class TrainNetwork {

    public static void main(String[] args) {
        Graph<String, String> network = new Graph<>();
        network.createAndConnectNode("Zoo", asList("Bahnhof Zoo"), new ArrayList<>());
        network.createAndConnectNode("Tiergarten", asList("Neben der TU"), asList("Zoo"));
        network.createAndConnectNode("Savignyplatz", asList("Restaurants"), asList("Zoo"));

        System.out.println(network);

    }




    private static List<String> asList(String str) {
        List<String> res = new ArrayList<String>();
        res.add(str);
        return res;
    }

}
