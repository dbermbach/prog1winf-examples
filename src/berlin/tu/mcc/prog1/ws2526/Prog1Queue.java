package berlin.tu.mcc.prog1.ws2526;

public interface Prog1Queue {

    public void enqueue(int i);

    public Integer dequeue();

    public int size();

    public boolean isEmpty();

}


class Prog1QueueBenchmark {

    public static void main(String[] args) {
        Prog1Queue dumb = new DumbArrayQueue();
        Prog1Queue smarter = new SlightySmarterArrayQueue();
        int noOfEnqueue = 1_000_000;
        int noOfDequeue = 1_000_000;
        long timeDumb = benchmark(dumb, noOfEnqueue, noOfDequeue);
        long timeSmarter = benchmark(smarter, noOfEnqueue, noOfDequeue);
        System.out.println("Results for " + noOfEnqueue +" enqueue() and " + noOfDequeue + " dequeue() calls:"
        +"\nDumbArrayQueue: " + timeDumb +" ms"
        +"\nSlightlySmarterArrayQueue: " + timeSmarter + "ms");


    }

    private static long benchmark(Prog1Queue q, int noOfEnqueue, int noOfDequeue) {
        int enqCounter = 0, deqCounter = 0;
        long start = System.currentTimeMillis();
        while (enqCounter < noOfEnqueue || deqCounter < noOfDequeue) {
            //System.out.println(dumb);
            if (enqCounter == noOfEnqueue) {
                // System.out.println("dumb: enq max reached");
                q.dequeue();
                deqCounter++;
            } else if (deqCounter == noOfDequeue) {
                //   System.out.println("dumb: deq max reached");
                q.enqueue(1);
                enqCounter++;
            } else {
                if (Math.random() < 0.5) {
                    q.dequeue();
                    deqCounter++;
                } else {
                    q.enqueue(1);
                    enqCounter++;
                }
            }
        }
        return System.currentTimeMillis() - start;
    }


}
