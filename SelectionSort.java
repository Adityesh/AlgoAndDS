import java.util.Scanner;


// Steps:
// 1. Take first element as the min element
// 2. Scan the rest of the list for the min element
// 3. Swap the min element with the first element.
// 4. Change the min pointer to the next element.
// 5. Repeat above steps till end of the list.


public class SelectionSort {
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
        int[] sorted = selectionSort(arr);
        for(int i : sorted) {
             System.out.print(i + " ");
        }
    }
    
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n - 1;i++) {
            int min = i;
            for(int j= i+1;j<n;j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
        return arr;
        
    }
}
