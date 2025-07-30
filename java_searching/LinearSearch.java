public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {15, 8, 29, 42, 4, 13, 17};
        int target = 13;
        int flag=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=i;
                break;
            }
        }
        if(flag!=-1){
             System.out.println("Found the match at index :"+flag);
        }
        else{
            System.out.println("element not found");
        }
    }
}