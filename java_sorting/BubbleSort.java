public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {20,10,3,4,6,12,42,31};
        int n = arr.length;
        for(int j=0;j<n;j++){
        for(int i=0;i<n-i-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}