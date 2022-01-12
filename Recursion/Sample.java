import java.util.Scanner;

class Sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int addition = (A+B);
        int substraction = (A-B);
        int multiplication = (A*B);
        int division = (A/B);
        boolean isAddition = addition > substraction && addition > multiplication && addition > division;
        boolean isSubstraction = substraction > addition && substraction > multiplication && substraction > division;
        boolean isMultiplication = multiplication > addition && multiplication > substraction && multiplication > division;
        boolean isDivision = division > addition && division > substraction && division > multiplication;
        if(isAddition) System.out.println("+");
        if(isSubstraction) System.out.println("-");
        if(isMultiplication) System.out.println("*");
        if(isDivision) System.out.println("/");
    }
}
