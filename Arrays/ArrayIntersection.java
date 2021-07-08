import java.util.Scanner;



class BruteForceSolution {

    public static




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
        int[] arr1 = takeInput();
        int[] arr2 = takeInput();
    }
}
