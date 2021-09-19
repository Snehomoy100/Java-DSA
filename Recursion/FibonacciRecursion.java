public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibonacciNumbers(1));
    }

    public static int fibonacciNumbers(int n){
        if(n < 2){
            return n;
        }

        return (fibonacciNumbers(n - 2) + fibonacciNumbers(n - 1));
    }
}
