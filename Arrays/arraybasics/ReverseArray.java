package arraybasics;

public class ReverseArray {

    public static void reverseArray(int[] arr){

        // Basic swapping 

        int i = 0;
        int j = (arr.length - 1);
        int temp;

        while(i < j){
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }



    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr = {30, 40, 50, 60, 70};
        reverseArray(arr);
        printArray(arr);
    }
}
