import java.util.Scanner;

class BruteForce {

    // Brute-Force Approach
    // Time Complexity -> O(N)
    // Space Complexity -> O(N)

    public static String reverseString(String str){
        String reverseString = "";
        for(int i=(str.length() - 1); i>=0; i--){
            reverseString += str.charAt(i);
        }

        return reverseString;
    }


    public static String stringInput(){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        return string;
    }

    public static void main(String[] args) {
        String str = stringInput();
        String strOutput = reverseString(str);
        System.out.println(strOutput);
    }
}




class MostOptimal{

    // Most Optimal Approach
    // Time Complexity -> O(N)
    // Space Complexity -> O(1)

    public static void reverseString(char[] str){
        int start = 0;
        int end = (str.length - 1);
        while(start <= end){
            char temp = str[end];
            str[end] = str[start];
            str[start] = temp;
            start++;
            end--;
        }
    }

    
    public static void main(String[] args) {
        char[] str = {'S', 'n', 'e', 'h', 'o', 'm', 'o', 'y'};
        reverseString(str);
        System.err.println(str);
    }
}
