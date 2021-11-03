public class ArraySorted {

    // to check if an array is sorted or not using recursion

    public static boolean checkSorted(int[] input){
        // base case
        if(input.length <= 1){
            return true;
        }

        // if the (n - 1) sized array is sorted or not
        int[] smallInput = new int[input.length - 1];
        // copying all the elements of input into smallInput
        for(int i=1; i<input.length; i++){
            smallInput[i - 1] = input[i];
        }

        boolean smallAns = checkSorted(smallInput);

        // if the small answer is sorted
        if(!smallAns){
            return false;
        }

        // if the element at 0th index is lesser than 1st index
        if(input[0] < input[1]){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 6, 9};
        boolean ans = checkSorted(input);
        System.out.println(ans);
    }
}
