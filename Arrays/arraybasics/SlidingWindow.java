package arraybasics;

import java.util.Scanner;

class SlidingWindow {
    
    // ** Fixed size Sliding Window Technique 
    // Time Complexity: O(n) + O(n) = O(n)
    // Space Complexity: O(1)

    public static int maxSumSubArray(int[] arr, int windowSize){
        if(arr.length < windowSize){
            System.out.println("Invalid!");
        }

        int maxSum = 0;
        for(int i=0; i<windowSize; i++){
            maxSum += arr[i];
        }

        int windowSum = maxSum;
        for(int i=windowSize; i<arr.length; i++){
            windowSum += arr[i] - arr[i-windowSize];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
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
        int k = 2;
        int maxSum = maxSumSubArray(arr, k);
        System.out.println("The maximum sum of k sized subarray is: " + maxSum);        
    }
}



class BetterCode{

    // Better & clean code with one loop only
    // Time Complexity: O(n)
    // Space Complexity: o(1)
    
    public static int maxSumSubArray(int[] arr, int k){
        int start = 0;
        int end = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while(end < arr.length){
            sum += arr[end];
            if(((end - start) + 1) != k){
                end++;
            } else if(((end - start) + 1) == k){
                maxSum = Math.max(maxSum, sum);
                sum -= arr[start];
                start++;
                end++;
            }
        }

        return maxSum;
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
        int sizeOfWindow = 2;
        int maxSumOfSubArray = maxSumSubArray(arr, sizeOfWindow);
        System.out.println("The max sum of subarray of size k is: " + maxSumOfSubArray);
    }
}
