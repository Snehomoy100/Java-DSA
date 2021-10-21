package problemsonarray;

public class EquilibriumIndex {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int totalSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int equilibriumIndex(int[] arr){
        int leftSum = 0;
        int rightSum = totalSum(arr);
        int i = 0;
        
        while(i < arr.length){
            rightSum -= arr[i];

            if(leftSum == rightSum){
                return i;
            }
            i = i + 1;

            leftSum += arr[i - 1];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int theEquilibriumIndex = equilibriumIndex(arr);
        System.out.println("The equilibrium index of the given array is: " + theEquilibriumIndex);
    }
}
