import java.util.*;

class QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        // Get the size of the array from the user
        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();


        // Get the elements for the array of size n
        System.out.println("Enter the elements for the array: ");
        int[] arr = new int[n];
        for(int i = 0;i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Print the unsorted array
        System.out.println("Unsorted array: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            
            // Get partition index from partition function
            int pIndex = partition(arr, low, high);

            // Call quick sort on the left of the partition
            quickSort(arr, low, pIndex);

            // Call partition on the right of the partion
            quickSort(arr, pIndex + 1, high);


        }
    }

    static int partition(int[] arr, int low, int high) {
        // Take the last element as the pivot
        int pivot = arr[low];
        // Left start index
        int start = low + 1;

        // Set the first and last indices for comparison
        for(int j = low + 1;j<= high;j++ ) {
            if(arr[j] < pivot) {
                // Swap the elements in i with the element at j
                int temp = arr[start];
                arr[start] = arr[j];
                arr[j] = temp;
                start++;
            }
        }
        // Swap the pivot with start - 1 to get the pivotIndex
        int temp = arr[start - 1];
        arr[start - 1] = pivot;
        arr[low] = temp;

        // pIndex for the given array
        return start - 1;
        



        

    }
}