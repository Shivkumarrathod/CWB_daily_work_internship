public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {20,10,3,4,6,12,42,31};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>key;j--){
                arr[j+1]=arr[j];
            }
            arr[j + 1] = key;
        }
        for(int i=0;i<n;i++){
           System.out.println(arr[i]);
        }
    }
}
