import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of elements in the array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +  n + " elements in the array");
        for(int i = 0;i<n;i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element to search for:");
        int search = s.nextInt();

        int position = linearSearch(arr, search);
        if(position == -1) {
            System.out.println("Element was not found in the array.");
        } else {
            System.out.println("Position of " + search + " is " + position);
        }

        s.close();
    }

     static int linearSearch(int[] arr, int search) {
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] == search) {
                return i;
            } 
        }
        return -1;

    }
}