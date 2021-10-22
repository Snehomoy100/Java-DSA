public class ProductOfDigits {

    // product of the each digits of a number
    public static int productOfDigits(int n){
        if(n % 10 == n){ // base case
            return n;
        }

        return ((n % 10) * productOfDigits(n / 10));
    }
    public static void main(String[] args) {
        System.out.println(productOfDigits(3852));
    }
}
