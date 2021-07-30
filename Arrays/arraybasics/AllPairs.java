package arraybasics;
public class AllPairs {

    public static void printAllPairs(int[] arr){
        for(int i = 0; i<(arr.length-1); i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8, 4, 2};
        printAllPairs(arr);
    }
}
