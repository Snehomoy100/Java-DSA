import java.util.Arrays;

public class QuickSort {
    
    // Time Complexity: O(nlogn) (best & average case) & O(n^2) (worst case)
    // primarily used in LinkedList & not stable sorting algo & in case arrays merge sort is preferred because of array's contigous memory allocation
    
    public static void quickSort(int[] arr, int low, int high){

        // base case
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int pivot = arr[middle];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
    
    public static void main(String[] args) {
        int[] arr = {34, 12, 0, -1, 32, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}


