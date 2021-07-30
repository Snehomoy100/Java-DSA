package arraybasics;
import java.util.Scanner;

public class SwapElements {

    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        return arr;
    }



    public static void swapElements(int[] arr){
        for(int index=0; index<arr.length - 1; index += 2){
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        swapElements(arr);
        System.out.println();
        System.out.println("After swapping the elements of the array is: ");
        printArray(arr);
    }
}
