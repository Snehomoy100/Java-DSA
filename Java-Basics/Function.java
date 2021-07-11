import java.util.Scanner;

public class Function {

    // function for factorial
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }

        return fact;
    }


    // function to check a no is prime or not
    public static boolean isPrime(int n){
        int d = 2;
        while(d < n){
            if (n % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }

    // function to print all the numbers upto n
    public static void noUpton(int n){ // void function returns nothing
        if(n <= 0){
            return; // return means termination of the function
        }
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
    
    // A program to find the NcR
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        
        int numerator = factorial(n); // fucntion calling

        int denominator_one = factorial(r);
        

        int denominator_two = factorial(n - r);

        boolean ansPrime = isPrime(19);
        System.out.println(ansPrime);
        
        // noUpton(-8);
        // the formula of NcR is N!/(R! * (N - R)!)
        int NcR = numerator/(denominator_one * denominator_two);
        System.out.println(NcR);

        input.close();
    }
}
