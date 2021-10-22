public class PrintNumbers {

    // print numbers from n to 1 using recursion (where n is any natural number)
    public static void printNumbers1(int n){
        if(n == 0){ // base case
            return;
        }

        System.out.println(n); // prints from n to 1
        printNumbers1(n - 1); // recurrance relation & recursive function
    }

    // print numbers from 1 to n using recursion (where n is any natural number)
    public static void printNumbers2(int n){
        if(n == 0){ // base case
            return;
        }
    
        printNumbers2(n - 1); // recurrance relation & recursive function
        System.out.println(n); // prints from 1 to n 
    }

    public static void main(String[] args) {
        printNumbers1(6);
        printNumbers2(6);
    }
}
