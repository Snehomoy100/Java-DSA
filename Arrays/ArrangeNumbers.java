
public class ArrangeNumbers {

    public static void arrangeNumbers(int[] arr, int sizeOfArray){
        int left = 0;
        int right = sizeOfArray - 1;
        int value = 1;

        while (left <= right) {
            if (value % 2 == 1) {
                arr[left] = value;
                value++;
                left++;
            } else {
                arr[right] = value;
                value++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

    }
    
}
