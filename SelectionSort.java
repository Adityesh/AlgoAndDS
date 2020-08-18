import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements for the array:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Before sorting: ");

        for(int i : arr) {
            System.out.print(i + " ");
        }

        int[] sorted = selectionSort(arr);
        System.out.println("After sorting: ");
        for(int i : sorted) {
            System.out.print(i + " ");
        }



        s.close();
    }

    static int[] selectionSort(int[] arr) {
        int min;

        for(int i=0;i<arr.length-1;i++) {
            min = i;
            for(int j = i+1;j<arr.length;j++) {
                if(arr[j] < arr[min]) {
                    min = arr[j];
                }

                int temp = arr[i];
                arr[min] = temp;
                arr[i] = min;
                
            }
        }

        return arr;
    }
}