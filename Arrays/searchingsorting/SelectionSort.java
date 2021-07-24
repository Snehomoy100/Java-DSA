package searchingsorting;

import java.util.Scanner;

public class SelectionSort {
    

    public static void selectionSort(int[] arr){
        // Inserting element at the ith index
        int n = arr.length;
        for(int i=0; i<(n - 1); i++){

            int minELement = Integer.MAX_VALUE;
            int minIndex = -1;

            // min element at the jth index
            for(int j=i; j<n; j++){
                if(arr[j] < minELement){
                    minELement = arr[j];
                    minIndex = j;
                }
            }

            //swap the element at ith index with minIndex
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
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
        int[] arr = takeInput();
        selectionSort(arr);
        printArray(arr);
    }
}
