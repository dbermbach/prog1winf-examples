package berlin.tu.mcc.prog1.ws2526;

public class DumbArrayQueue implements Prog1Queue {

    private int[] values = new int[0];

    @Override
    public void enqueue(int val) {
        int [] valNew = new int[values.length+1];
        for(int i = 0;i<values.length;i++){
            valNew[i] = values[i];
        }
        valNew[valNew.length-1] = val;
        values = valNew;
    }

    @Override
    public Integer dequeue() {
        if(isEmpty())return null;
        int [] valNew = new int[values.length-1];
        for(int i =0;i<valNew.length;i++){
            valNew[i] = values[i+1];
        }
        int res = values[0];
        values = valNew;
        return res;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean isEmpty() {
        return values.length==0;
    }

    public String toString(){
        if(isEmpty())return "[]";
        String res = "[";
        for(int val: values)res += val + ",";
        res = res.substring(0,res.length()-1);
        return res + "]";
    }

    public static void main(String[] args) {
        Prog1Queue q = new DumbArrayQueue();
        q.enqueue(42);
        System.out.println(q);
        q.enqueue(3);
        System.out.println(q);
        q.enqueue(8);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.enqueue(12);
        System.out.println(q);
        q.enqueue(1);
        System.out.println(q);
    }
}
