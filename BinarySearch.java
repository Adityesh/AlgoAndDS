import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
         
        int n = s.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for(int i = 0;i< n;i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element to search for:");
        int search = s.nextInt();


        int position = binarySearch(arr,search, 0, arr.length - 1 );

        if(position == -1) {
            System.out.println("Element was not found in the array.");
        } else {
            System.out.println("Postion of element " + search + " is " + (position + 1));
        }

        s.close();
    }


    

    static int binarySearch(int[] arr, int search, int low, int high) {

        if(low <= high) {
            int mid = (low) + (high - low) / 2;
            if(arr[mid] == search) {
                return mid;
            } else if(search > arr[mid]) {
                return binarySearch(arr, search, mid + 1, high);
            } else if(search < arr[mid]) {
                return binarySearch(arr, search, low, mid - 1);
            }
        }
        return -1;
        


    }

}