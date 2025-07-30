public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {20,10,3,7,6,12,42,31};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if (arr[min]>arr[j]) {
                    min=j;
                }
            }
            if(min!=i){
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
