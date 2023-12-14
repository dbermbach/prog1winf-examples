package berlin.tu.mcc.prog1.ws2324.graph;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T, U> {

    private final Map<T, GraphNode<T, U>> nodes = new HashMap<>();

    public GraphNode<T, U> getNodeForIdentifier(T o) {
        return nodes.get(o);
    }

    public void createAndConnectNode(T identifier, List<U> values, List<T> neighbors) {
        GraphNode<T, U> node = new GraphNode<>(identifier, values);
        for (T id : neighbors) {
            GraphNode<T, U> other = getNodeForIdentifier(id);
            if (other != null) node.connectTo(other);
            else System.out.println("Node for identifier " + id + " is unknown.");
        }
        nodes.put(identifier,node);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + nodes +
                '}';
    }
}

