public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 12, 43};
        System.out.println(checkSorted(arr, 0));
    }

    public static boolean checkSorted(int[] arr, int index){
        // base case
        if(index == arr.length - 1){
            return true;
        }

        return (arr[index] < arr[index + 1] && checkSorted(arr, index + 1));
    }
}
