package arraybasics;
import java.util.Scanner;


public class TripletSum {
    
    public static int tripletSum(int[] arr, int x){
        int numberOfTriplets = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if((arr[i] + arr[j] + arr[k]) == x){
                        numberOfTriplets += 1;
                    }
                }
            }
        }

        return numberOfTriplets;
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
        int[] arr = takeInput();
        int sum = 12;
        int numberOfTotalTriplets = tripletSum(arr, sum);
        System.out.println("The triplets are: " + numberOfTotalTriplets);
    }

    // Time Complexity: O(n^3)
    // Space Complexity: O(1)

    // This is not the best or optimal solution will add the best solution soon

    
}
