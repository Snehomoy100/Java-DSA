package searchingsorting;

public class BubbleSort {
    
    
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length -1; i++){
            for(int j=0; j<arr.length - i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }



    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    
    public static void main(String[] args) {
        int[] arr = {45, 0, 98, 12, 5, 4, 1};
        bubbleSort(arr);
        printArray(arr);
    }
}
