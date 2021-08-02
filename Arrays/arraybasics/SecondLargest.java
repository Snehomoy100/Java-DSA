package arraybasics;

import java.util.Scanner;

public class SecondLargest{

    public static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
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
    }
}