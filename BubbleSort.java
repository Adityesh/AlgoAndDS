import java.util.Scanner;


// Steps:
// For all elements in the list
// Compare two consecutive elements and swap
// if they are not in order
// Continue swapping until the end of the list



public class BubbleSort {
    public static void main(String[] args) {
        // Input the number of elements for the unsorted array
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        // Input n elements in a n sized array
        int[] arr = new int[n];
        
        for(int i = 0;i< n;i++) {
            arr[i] = s.nextInt();
        }
        
        // Print unsorted array to stdout
        System.out.println("Unsorted array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        // Print sorted array to stdout
        System.out.println("Sorted array: ");
        int[] sorted = bubbleSort(arr);
        for(int i : sorted) {
             System.out.print(i + " ");
        }
    }
    
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n-1;i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
        return arr;
        
    }
}
