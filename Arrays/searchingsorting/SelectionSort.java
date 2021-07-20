package searchingsorting;

import java.util.Scanner;

public class SelectionSort {
    

    public static int[] selectionSort(int[] arr){
        
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
    }
}
