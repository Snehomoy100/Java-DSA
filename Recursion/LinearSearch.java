public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 3, 56, 0, 6, 0};
        System.out.println(linearSearch(arr, 0, 0)); // from 0th index
        System.out.println(linearSearchFromLast(arr, arr.length, 56)); // from (n - 1)th index
    }

    public static int linearSearch(int[] arr, int index, int x){
        // base case
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == x){
            return index;
        } else{
            return(linearSearch(arr, index + 1, x));
        }
    }

    public static int linearSearchFromLast(int[] arr, int index, int x){
        // base case
        if(index == -1){
            return -1;
        }

        if(arr[index] == x){
            return index;
        } else{
            return(linearSearchFromLast(arr, index - 1, x));
        }
    }
}
