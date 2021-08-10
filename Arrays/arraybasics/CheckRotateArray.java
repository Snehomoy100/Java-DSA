package arraybasics;

public class CheckRotateArray {

    public static int checkRotateArray(int[] arr){
        for(int i=0; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                return(i + 1);
            }
            
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int indexOfRotation = checkRotateArray(arr);
        System.out.println("The index from where the array is being rotated: " + indexOfRotation);
    }
}
