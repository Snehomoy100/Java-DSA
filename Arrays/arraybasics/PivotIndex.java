package arraybasics;

public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        
        // Time complexity is: O(n + n) = O(2n) ~= O(n)
        // Space complexity is: O(1)

        // corner case for only one element in array
        if(nums.length == 1){
            return nums[0];
        } 
        
        // corner case for only two elements in array
        else if(nums.length == 2){
            return -1;
        }
        
        
        // for more than two elements
        else{
        // sum of the whole array
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        
        int leftSum  = 0;
        int rightSum  = sum;
        
        for(int i=0; i<nums.length; i++){
            rightSum = rightSum - nums[i];
            
            if(leftSum == rightSum){
                return i;
            }
            
            leftSum += nums[i];
            }
        }
        
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4};
        int pivotIndex = pivotIndex(arr);
        System.out.println(pivotIndex);
    }
}
