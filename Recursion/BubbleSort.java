import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0};
        bubbleSortRecursion(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSortRecursion(int[] arr, int size){
        
        // base case
        if(size == 0) {
            return;
        }

        // iteraing over the array
        for(int i=0; i<(size - 1); i++){

            if(arr[i] > arr[i+1]){
            // swap
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            }
        }

        bubbleSortRecursion(arr, size - 1);

    }
}
