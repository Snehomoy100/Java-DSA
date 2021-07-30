package arraybasics;
import java.util.Scanner;

class UniqueElementBruteForce {

    // Time complexity for this approach is O(n^2)

    public static int uniqueElement(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int j;
            for(j=0; j<arr.length; j++){
                if( i != j){
                    if(arr[i] == arr[j]){
                        break;
                    }
                }
            }
            if(j == arr.length){
                return arr[i];
            }
        
        }

        return Integer.MAX_VALUE;
        
    }


    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        int uniqueNumber = uniqueElement(arr);
        System.out.println();
        System.out.println("The unique element in the array is: " + uniqueNumber);
    }
}






class UniqueElementMostOptimal {

    // Time complexity for this approach is O(n)

    public static int uniqueElement(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans ^ arr[i];
        }
        return ans;
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
        int uniqueNumber = uniqueElement(arr);
        System.out.println();
        System.out.println(uniqueNumber);
    }
}
