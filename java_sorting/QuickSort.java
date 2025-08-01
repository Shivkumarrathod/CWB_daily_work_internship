public class QuickSort {
    
    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1); 
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; 
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 3, 4, 6, 12, 42, 31};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
