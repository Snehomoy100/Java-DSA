package arraybasics;
import java.util.Scanner;


public class PairSum {
    
    public static void pairSum(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i] + arr[j]) == x){
                    System.out.println(arr[i] + " " + arr[j]);
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
        int[] arr = takeInput(); // this array can have duplicate elements also
        int sum = 9;
        System.out.println("The pairs are: ");
        pairSum(arr, sum);
    }


    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
}
