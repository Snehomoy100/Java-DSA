package arraybasics;

public class Sort01 {
    
    public static void sortThe01(int[] arr){
        int startingIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                int temp = arr[startingIndex];
                arr[startingIndex] = arr[i];
                arr[i] = temp;
                startingIndex += 1;
            }
        }
    } 
    
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1};
        sortThe01(arr);
        printArray(arr);
    }
}
