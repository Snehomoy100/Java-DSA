package arraybasics;
import java.util.Scanner;

public class ArrayIntersection {

    public static void arrayIntersection(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr2[j]);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }



    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        return arr;
    }


    public static void main(String[] args) {
        System.out.println("Your first array: ");
        int[] arr1 = takeInput();
        System.out.println("Your second array: ");
        int[] arr2 = takeInput();
        System.out.println("Intersection part from the arrays are: \n");
        arrayIntersection(arr1, arr2);
    }
}
