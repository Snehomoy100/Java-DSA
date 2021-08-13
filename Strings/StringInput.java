import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next(); // token & delimeter concept exist
        System.out.println(str);

        int i = input.nextInt(); 
        String str2 = input.nextLine(); // token & delimeter concept doesn't exist
        System.out.println(str2 + " " + str2.length());
    }
}
