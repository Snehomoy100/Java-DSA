package searchingsorting;

import java.util.Scanner;

public class BinarySearch{
    
    // Primary condition for performing binary search is that, the array should be sorted
    
    public static int binarySearch(int[] arr, int x){

        int start = 0;
        int end = (arr.length - 1);

        while(start <= end){

            int mid = (start + end)/2;
            if (arr[mid] > x) {
                end = (mid - 1);
            } else if(arr[mid] < x){
                start = (mid + 1);
            } else{
                return mid;
            }
        }

        return -1;
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
        int elementToSearch = 13;
        int index = binarySearch(arr, elementToSearch);
        System.out.println("The searched element is present at index no. : " + index); 
    }
}