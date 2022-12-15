package de.tuberlin.mcc.prog1winf.datastructures;

public class Factorial {

    public static int factorialIterative(int n){
        int res = 1;
        while(n>1) res *= n--;
        return res;
    }

    public static int factorialRecursive(int n){
        if (n==1) return 1;
        return n*factorialRecursive(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
       // System.out.println("Iterative: "+ factorialIterative(n));
       // System.out.println("Recursive: "+ factorialRecursive(n));
        benchmark();
    }

    private static void benchmark() {
        long start, afterIterative, end;
        int max = 500, iterations = 10000;
        System.out.println("n;iterative_in_ns;recursive_in_ns");
        for(int n = 1; n<=max;n++){
            start = System.nanoTime();
            for(int i=0;i<iterations;i++) factorialIterative(n);
            afterIterative = System.nanoTime();
            for(int i=0;i<iterations;i++) factorialRecursive(n);
            end = System.nanoTime();
            System.out.println(n+";"+(afterIterative-start)+";"+ (end-afterIterative));
        }


    }


}
