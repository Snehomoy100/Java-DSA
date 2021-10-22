public class SumOfDigits {

    // sum of the each digits of a number
    
    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }

        return((n%10) + sumOfDigits(n / 10));
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(3852));
    }
}
