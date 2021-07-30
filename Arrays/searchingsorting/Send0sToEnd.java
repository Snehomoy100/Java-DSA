package searchingsorting;

public class Send0sToEnd {
    
    public static void send0sToEnd(int[] arr){

        // Classic two pointer approach which takes no extra space & does the thing in place

        if(arr.length==0 || arr.length==1)
            return;
        
        int right = 0;
        int left = 0;
        int temp;
        while(right < arr.length){
            if(arr[right] == 0){
                right++;
            } else {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right++;
                left++;
            }
        }
    }



    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 34, 0, 45, 5, 9};    
        send0sToEnd(arr);
        printArray(arr);
    }
}
