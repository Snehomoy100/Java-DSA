public class ReverseWords {

    public static void reverseTheWords(char[] str){
        reverseString(str);

        int i = 0;
        while(str[i] != ' '){
            char temp = str[i];
    
        }
    }

    public static void reverseString(char[] str){
        int start = 0;
        int end  = (str.length - 1);

        while(start <= end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
    }
}
