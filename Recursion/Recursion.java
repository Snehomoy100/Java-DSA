public class Recursion {

    // Introduction to Recursion
    // Why we need & use Recursion
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n){
        if(n == 5){ // base case or base condition
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n + 1); // (n + 1) -> recurrance relation & the print() func is a recursive function
    }
}
