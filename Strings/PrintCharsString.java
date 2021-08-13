import java.util.Scanner;

public class PrintCharsString {
    
    public static void printCharsInString(String str){
        for(int index=0; index<str.length(); index++){
            System.out.println(str.charAt(index));
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        printCharsInString(str);
    }
}
