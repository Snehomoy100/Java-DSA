package arraybasics;

public class SqareOfSortedArray {

    // two-pointer approach

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int minElement = 0; // first pointer
        int maxElement = nums.length - 1; // second pointer
        int index = nums.length - 1; // for inserting the elements in the result array
        
        while(minElement <= maxElement){
            int val1 = nums[minElement] * nums[minElement];
            int val2 = nums[maxElement] * nums[maxElement];
            
            if(val1 >= val2){
                result[index] = val1;
                minElement++;
            }
            else{
                result[index] = val2;
                maxElement--;
            }
            
            index--;
        }
        
        return result;
    }


    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] theResult = sortedSquares(nums);
        printArray(theResult);
    }   
}
