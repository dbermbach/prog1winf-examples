package berlin.tu.mcc.prog1.ws2627;

public class Methoden {

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 2, 1}, arr2 = {14, 7, 8, 4, 6};
        int tmp = 42;
       double d = printArray(arr1,tmp);
        printArray(arr2,tmp);

        int tmp2 = tmp;
        int[] arr3 = arr1;

    }


    public static void printArray(int[] array,int i) {
        if(array==null) return;
        for (int value : array) System.out.println(value);
        System.out.println("i was " +i);

        return;

    }


}
