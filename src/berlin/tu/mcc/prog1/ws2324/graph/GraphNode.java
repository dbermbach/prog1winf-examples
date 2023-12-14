package berlin.tu.mcc.prog1.ws2324.graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphNode<T,U> {

    final T identifier;

    final List<U> values = new ArrayList<>();

    final Map<T,GraphNode<T,U>> edges = new HashMap<>();

    public GraphNode(T identifier, List<U> values) {
        this.identifier = identifier;
        this.values.addAll(values);
    }

    public GraphNode(T identifier, U value){
        this.identifier = identifier;
        this.values.add(value);
    }

    public void connectTo(GraphNode<T,U> other){
        this.edges.put(other.identifier,other);
        other.edges.put(this.identifier,this);
    }

    public boolean isConnectedTo(T other){
        return edges.get(other) != null;
    }

    public int getNumberOfNeighbors(){
        return edges.size();
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "identifier=" + identifier +
                ", values=" + values +
                ", edges=" + edges.keySet() +
                '}';
    }
}

