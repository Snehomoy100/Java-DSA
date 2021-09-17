public class Recursion {

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
        print(n + 1);
    }
}
