//Difference betweeen List,Set,Map,,Difference Between ArrayList,LinkedList,Vector,,Difference between TreeSet,HashSet and Linked HashSet
 
public class ArrayExample {
    public static void main(String[] args) {
        // initializing array
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] numbers = new int[5];
        // size of array
        int n = arr.length;

        // traversing array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        //assignment of values 
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;

        for (int i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");
    }
}
