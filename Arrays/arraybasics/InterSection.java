package arraybasics;
import java.util.Scanner;



public class InterSection {
    
    public static void interSection(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                     System.out.println(arr2[j] + " ");
                    arr2[j] = Integer.MIN_VALUE; // to handle the corner case of duplicates
                    break;
                }
            }
        }

        
    }
    

    
    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int index=0; index<n; index++){
            arr[index] = input.nextInt();
        }

        return arr;
    }
    
    
    public static void main(String[] args) {
        int[] arr1 = takeInput();
        int[] arr2 = takeInput();
        System.out.println("Elements from the Intersections are: ");
        interSection(arr1, arr2);
    }

    // Time Complexity: O(n * m) n & m is the size of two arrays consequently
}
