import java.util.*;

class MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();

        // Array of size n is initialized
        int[] arr = new int[n];

        System.out.println("Enter the elements into the array: ");
        // Array elements are entered
        for(int i = 0;i < n;i++) {
            arr[i] = s.nextInt();
        }


        // Show the unsorted array first
        System.out.println("Unsorted array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println();

        // Show the sorted array
        System.out.println("Sorted array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }


    }


    static void mergeSort(int[] arr, int low, int high) {
        // Only if elements are present in the array
        if(low < high) {
            int mid = low + (high - low) / 2;
            // Call mergesort on the left array
            mergeSort(arr, low, mid);
            // Call mergesort on the right array
            mergeSort(arr, mid + 1, high);
            // Merge the two array in sorted manner
            merge(arr, low, mid, high);

        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        // Size of left array (Plus 1 as array starts from 0)
        int leftSize = mid - low + 1;

        // Size of the right array
        int rightSize = high - mid;

        // Create two temp arrays to store the left and the right arrays
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        // Copy the left part in to the array
        for(int i = 0;i<leftSize;i++) {
            left[i] = arr[low + i];
        }

        // Copy the right part into the array
        for(int i = 0;i< rightSize;i++) {
            right[i] = arr[mid + 1 + i];
        }

        // Sorted array index start position
        int k = low;

        // Left and right array index start positions
        int i = 0;
        int j = 0;

        // Compare and replace the positons of the original array with sorted values
        while(i < leftSize && j < rightSize) {
            // Right array has smaller value so put it in the original and increment right index
            if(left[i] > right[j]) {
                arr[k] = right[j];
                j++;
            // Left array has smaller value so put it in the original and increment left index
            } else if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }

            k++;
        }

        while(j < rightSize) {
            arr[k] = right[j];
            j++;
            k++;
        }
        while(i < leftSize) {
            arr[k] = left[i];
            i++;
            k++;
        }

    }
}