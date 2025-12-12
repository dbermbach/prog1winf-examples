package berlin.tu.mcc.prog1.ws2526;

public class SlightySmarterArrayQueue implements Prog1Queue {

    private Integer[] values = new Integer[1];

    private int headPos = 0, tailPos = -1;

    @Override
    public void enqueue(int val) {
   //     System.out.println("pre-insert ("+val+")="+getStatusString());
        if(tailPos<headPos){
            //queue is empty
            headPos=0;
            tailPos=-1;
        }
        if(tailPos==values.length-1){
            //end of values has been reached, copy array
            Integer [] copy = copyValues(headPos,tailPos,Math.max(2, values.length));
            values = copy;
            tailPos= tailPos-headPos;
            headPos=0;
        }
        //now insert value
        values[++tailPos] = val;
   //     System.out.println("post-insert ("+val+")="+getStatusString());
    }

    /**
     *
     * @param first first index position to copy
     * @param last last index position to copy
     * @param padding number of empty cells after the content from values[last]
     * @return a new array containing values[first] to values[last] plus padding empty cells
     */
    private Integer[] copyValues(int first, int last, int padding){
       // System.out.println("values="+values+", first="+first+ ", last="+last+ ", padding="+padding);
        if(values==null||last<first||first<headPos||last>tailPos){
            return null;
        }
        Integer [] res = new Integer[last-first+padding+1];
        for(int i=0;i<last-first+1;i++){
            res[i] = values[first+i];
        }
     //   System.out.println("copied values plus "+padding + " cells padding:"+"\nvalues="+arrayAsString(values)+"\nvalues_new="+arrayAsString(res));
        return res;

    }

    @Override
    public Integer dequeue() {
      //  System.out.println("pre-remove="+getStatusString());
        if(isEmpty())return null;
        Integer out = values[headPos];
        values[headPos]=null;
        headPos++;
       // System.out.println("post-remove="+getStatusString());
        return out;
    }

    @Override
    public int size() {
        return tailPos-headPos;
    }

    @Override
    public boolean isEmpty() {
        return tailPos<headPos;
    }

    public String toString(){
        return arrayAsString(values,true);
    }

    private String getStatusString(){
        return arrayAsString(values) + ", headPos="+headPos+", tailPos="+tailPos;
    }


    private String arrayAsString(Integer [] vals){
        return arrayAsString(vals,false);
    }

    private String arrayAsString(Integer[] vals, boolean skipNull){
        String res = "[";
        for(Integer val: vals){
            if(skipNull&&val==null)continue;
            res += val + ",";}
        res = res.substring(0,res.length()-1);
        return res + "]";
    }

    public static void main(String[] args) {
        Prog1Queue q = new SlightySmarterArrayQueue();
        q.enqueue(42);
        //System.out.println(q);
        q.enqueue(3);
        //System.out.println(q);
        q.enqueue(8);
        //System.out.println(q);
        q.dequeue();
        //q.dequeue();
        // q.dequeue();
        //q.dequeue();
        //q.dequeue();
        //System.out.println(q);
        q.enqueue(12);
        //System.out.println(q);
        q.enqueue(1);
        //System.out.println(q);
    }

}
