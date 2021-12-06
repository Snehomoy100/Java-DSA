import java.util.Arrays;

// Merge Sort using extra space
public class MergeSort {
    public static void main(String[] args) {
        
    }

    public static int[] mergeSort(int[] arr){
        
        // base case
        if(arr.length == 1){
            return arr;
        }

    
        int mid = (arr.length / 2);

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length - 1));

        // helper function or helper method
        return merge(left, right);
    }

    
    // helper method
    public static int[] merge(int[] first, int[] second){

        int[] mergedArray = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mergedArray[k] = first[i];
                i++;
            } else {
                mergedArray[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mergedArray[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mergedArray[k] = second[j];
            j++;
            k++;
        }

        return mergedArray;
    }

}
