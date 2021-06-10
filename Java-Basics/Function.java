import java.util.Scanner;

public class Function {

    // function of factorial
    public static int factorial(int n){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans * i;
        }
        return ans;
    }
    
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
        

        int denominator_two = 1;
        

        // the formula of NcR is N!/(R! * (N - R)!)
        int NcR = numerator/(denominator_one * denominator_two);
        System.out.println(NcR);

        input.close();
    }
}
