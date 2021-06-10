import java.util.Scanner;

public class Function {
    
    // A program to find the NcR
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        
        int numerator = 1;
        for(int i = 1; i <= n; i++){
            numerator = numerator * i;
        }

        int denominator_one = 1;
        for(int i = 1; i <= r; i++){
            denominator_one = denominator_one * i;
        }

        int denominator_two = 1;
        for(int i = 1; i <= (n - r); i++){
            denominator_two = denominator_two * i;
        }
        
        int NcR = numerator/(denominator_one * denominator_two);
        System.out.println(NcR);

        input.close();
    }
}
