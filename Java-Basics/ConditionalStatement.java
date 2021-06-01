import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        // Question: Given a number n, find if the number is even or odd
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + "is an even no.");
        } else {
            System.out.println(n + "is an odd no.");
        }
        input.close();
    }
}
