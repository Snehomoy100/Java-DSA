package arraybasics;
import java.util.Scanner;

public class ArraySum {
    public static void arraySum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

    }

    

    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        return arr;
    }



    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println("Sum of the elements of your array is : ");
        arraySum(arr);
        System.out.println("This is done using Sublime Text Editor");
    }

}