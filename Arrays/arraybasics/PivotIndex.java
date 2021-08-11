package arraybasics;

public class PivotIndex {

    public static int sum(int[] arr, int a, int b){
        int sum = 0;
        for(int i = a; i<=b; i++){
            sum += arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sumUpto = sum(arr, 0, 2);
        System.out.println(sumUpto);
    }
}
