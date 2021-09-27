public class BInarySearchRecursion {

    public static int binarySearch(int[] arr, int x){
        int n = arr.length;
        int start = 0;
        int end = (n - 1);

        while(start <= end){
        
            
            int mid = (start + end) / 2;
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
        int[] arr = {-3, 0, 10, 20, 34, 56, 67, 87};
        int x = 34;
        int searchedIndex = binarySearch(arr, x);
        System.out.println(searchedIndex);

    }
}
