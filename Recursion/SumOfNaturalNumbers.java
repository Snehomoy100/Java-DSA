public class SumOfNaturalNumbers {
    
    public static int sumOfNaturalNumbers(int n){
        if(n == 1){
            return n; // base case
        }

        return (n + sumOfNaturalNumbers(n - 1)); // recurrance relation
    }
    public static void main(String[] args) {
        int n = 60;
        System.out.println("Sum of the first " + n + " natural numbers: " + sumOfNaturalNumbers(n));
 }   
}
