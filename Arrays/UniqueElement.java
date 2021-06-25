import java.util.Scanner;

public class UniqueElement {

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


    public static int[] inputArray(int n){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = inputArray(5);
        uniqueElement(arr);
    }
}
