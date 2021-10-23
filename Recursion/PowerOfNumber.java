public class PowerOfNumber {

    // calculate the power of a number recursively
    public static int powerOfNumber(int x, int n){
        
        if(x == 0 && n == 0){
            return 0;
        }

        if(x == 0){
            return 0;
        }

        if(n == 0){ // base cases
            return 1;
        }

        return(x * (powerOfNumber(x, (n-1)))); // recurrance relation
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 6;
        System.out.println(powerOfNumber(x, n));
    }
}
