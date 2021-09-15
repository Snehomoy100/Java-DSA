package arraybasics;

public class ThreeSum {
    public static void threeSum(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println("Hola..!");
                    } else {
                        System.out.println("Nola..!");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        threeSum(arr);
    }
}
