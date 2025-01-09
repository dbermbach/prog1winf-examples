package berlin.tu.mcc.prog1.ws2425;

import java.util.ArrayList;
import java.util.List;

public class Pair<T,U> {

    T first;
    U second;


    public Pair(T first, U second) {
        this.first = first;
        this.second = second;

    }
}





class IdenticalPair<T> extends Pair<T,T>{

    public IdenticalPair(T first, T second){
        super(first,second);
    }
}

class MyMainClass{
    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair<>("hello world", 123);
        Pair<Double, Double> p2 = new Pair<>(123.0,123.0);
        System.out.println("p: "+p.first.getClass().getSimpleName() + "-" + p.second.getClass().getSimpleName());
        System.out.println("p2: " + p2.first.getClass().getSimpleName() + "-" + p2.second.getClass().getSimpleName());
        List<Pair<String,Integer>> pairlist = new ArrayList<>();
        //pairlist.add(p2); //geht nicht
        pairlist.add(p);
    }
}
