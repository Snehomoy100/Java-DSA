import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        System.out.println("The value is " + a);
        sc.close();
    }
}