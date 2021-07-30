package arraybasics;
import java.util.Scanner;

public class ArrangeNumbers {
    

    public static void arrangeNumbers(int[] arr){
        int left = 0;
        int right = (arr.length - 1);
        int value = 1;

        while (left <= right) {
            if (value % 2 == 1) {
                arr[left] = value;
                value++;
                left++;
            } else {
                arr[right] = value;
                value++;
                right--;
            }
        }
    }



    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        return arr;
    }




    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        int[] arr = takeInput();
        arrangeNumbers(arr);
        System.out.println("\n");
        System.out.println("The arranged array is: ");
        printArray(arr);
    }
    
}
