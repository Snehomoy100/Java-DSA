public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 3, 56, 0, 6, 0};
        System.out.println(linearSearch(arr, 0, 0));
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
}
