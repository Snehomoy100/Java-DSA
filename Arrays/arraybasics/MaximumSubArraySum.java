package arraybasics;

class BruteForce {

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
