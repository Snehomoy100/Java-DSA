package arraybasics;

public class DuplicateSortedArray{

    public static int removeDuplicates(int[] arr){

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        // corner case: if arr.length is 0
        if(arr.length == 0) return 0;

        // two-pointer algorithm
        int firstPointer = 0;
        int secondPointer = firstPointer + 1;
        while(secondPointer < arr.length){
            if(arr[firstPointer] != arr[secondPointer]){
                firstPointer++;
                arr[firstPointer] = arr[secondPointer];
            }
            secondPointer++;
        }

        // just have to return the next index
        return (firstPointer + 1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 4, 4, 4};
        int duplicatesRemoved = removeDuplicates(arr);
        System.out.println(duplicatesRemoved);
    }
}