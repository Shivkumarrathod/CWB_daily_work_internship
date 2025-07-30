public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 22, 30, 36, 42}; // Must be sorted
        int target = 22;
 
        int index = binarySearch(arr, target);
        // int index = binarySearchRecursive(arr,0,arr.length-1, target);
 
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
 
    public static int binarySearch(int[] arr, int key) 
    {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int binarySearchRecursive(int[] arr, int low, int high, int key) 
    {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                return binarySearchRecursive(arr, mid + 1, high, key);
            else
                return binarySearchRecursive(arr, low, mid - 1, key);
        }
        return -1;
    }

}