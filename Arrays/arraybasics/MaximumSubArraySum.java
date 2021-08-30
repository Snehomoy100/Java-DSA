package arraybasics;

class BruteForce {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int maxSubArraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 4, -1, 0, -2, 6, 2};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum sum of sub arrays is: " + maxSum);
    }
}



class MostOptimal {

    // Time Complexity: O(n)
    // Space Complexity: O(1) ** KADANE's Algorithm **
    public static int maxSubArraySum(int[] arr){
        int sum = 0;
        int maxSum =  arr[0];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > maxSum) {
                maxSum = sum;
            };
            if(sum < 0){
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 4, -1, 0, -2, 6, 2};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum sum of sub arrays is: " + maxSum);
    }
}
