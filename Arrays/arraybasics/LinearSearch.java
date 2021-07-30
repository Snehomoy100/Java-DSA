package arraybasics;
import java.util.Scanner;


public class LinearSearch {


    public static int linearSearch(int arr[], int x){
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
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
        
        int searchElement = 10;
        int arr[] = takeInput();
        int searchIndex = linearSearch(arr, searchElement);
        System.out.println("The index of the searched element is: " + searchIndex);

        
    }
}
