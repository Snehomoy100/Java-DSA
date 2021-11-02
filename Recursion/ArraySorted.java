public class ArraySorted {

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
        if(smallAns){
            
        }
    }
    public static void main(String[] args) {
        
    }
}
