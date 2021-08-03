package arraybasics;

import java.util.Scanner;

public class SecondLargest{

    public static int secondLargest(int[] arr){

        if(arr.length < 2){ //corner case if the size of array is 0 or 1
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max && arr[i] != max){
                secondMax = max;
                max = arr[i];
            }
        }

        return secondMax;
    }


    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        int secondLargestElement = secondLargest(arr);
        System.out.println("The second largest element is: " + secondLargestElement);
    }
}