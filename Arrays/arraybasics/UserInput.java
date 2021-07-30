package arraybasics;
import java.util.Scanner;

public class UserInput{


    public static void printInput(int arr[]){
        int n = arr.length;
        for(int j=0; j<n; j++){
            System.out.println(arr[j]);
        }
    }


    public static int[] takeInput(){ // return type is int because it's returning the integer array. 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the element at " + i + "th position: ");
            arr[i] = input.nextInt();
        }

        return arr;
    }
    public static void main(String[] args) {
        
        int arr[] = takeInput();
        System.out.println("Your array is: ");
        printInput(arr);
    }
}