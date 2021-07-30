package arraybasics;

public class RotateArray {
    
    public static void rotateArray(int[] nums, int noOfRotations){
        
        // one rotation means -> the last element will come at index 0 & rest of will shifted by 1 index

        int n = nums.length;

        noOfRotations %= n; // for large numbers 

        if(noOfRotations < 0){
            noOfRotations += n; // to handle the -ve cases
        }

        // Step -> 1 (reverse the whole array)
        reverseArray(nums, 0, (n - 1));

        // Step -> 2 (reverse the elements from 0 to (noOfRotations-1))
        reverseArray(nums, 0, (noOfRotations - 1));

        // Step -> 3 (reverse the elements from noOfRotations to (n-1))
        reverseArray(nums, noOfRotations, (n - 1));

    }



    public static void reverseArray(int[] arr, int start, int end){
        int startFrom = start;
        int endAt = end;
        int temp;

        while(startFrom < endAt){
            temp = arr[endAt];
            arr[endAt] = arr[startFrom];
            arr[startFrom] = temp;
            startFrom++;
            endAt--;        
        }
    }

    

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int noOfRotations = 3;
        rotateArray(nums, noOfRotations);
        printArray(nums);
    }
}
