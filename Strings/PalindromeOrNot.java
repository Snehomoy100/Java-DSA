import java.util.Scanner;

public class PalindromeOrNot {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static boolean isPalindrome(String str){
        // two-pointer approach
        int left = 0;
        int right = (str.length() - 1);

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            } else{
                right--;
                left++;
            }
        }

        return true;
    }


    public static String takeInput(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }

    public static void main(String[] args) {
        String str = takeInput();
        boolean palindromeOrNot = isPalindrome(str);
        System.out.println(palindromeOrNot);
    }
}
