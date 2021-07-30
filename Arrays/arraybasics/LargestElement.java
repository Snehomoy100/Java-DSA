package arraybasics;
import java.util.Scanner;

public class LargestElement {

    public static int largestInArrray(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int index=0; index<arr.length; index++){
            if (max < arr[index]) {
                max = arr[index];
            } 
        }

        return max;
    }

    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int index = 0; index<n; index++){
            System.out.println("Enter the element at " + index + "th position: ");
            arr[index] = input.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println("No. of elements in the array: ");
        int arr[] = takeInput();
        int largestOfArray = largestInArrray(arr);
        System.out.println("Largest element in the array is: " + largestOfArray);
    }


}
