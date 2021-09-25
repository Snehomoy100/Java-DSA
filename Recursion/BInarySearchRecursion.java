public class BInarySearchRecursion {

    public static int binarySearch(int[] arr, int x){
        int n = arr.length;
        int start = arr[0];
        int end = arr[n - 1];
        int mid = (start + end) / 2;

        while(start <= end){
            if(arr[mid] > x){
                end = (mid - 1);
            }
            else if(arr[mid] == x){
               return mid;
            }
            else{
                start = (mid + 1);
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        
    }
}
