public class SkipChar {
    public static void main(String[] args) {
        String str = "hello";
        char target = 'l';
        String ans = skipChar(str, target);
        System.out.println(ans);

    }

    public static String skipChar(String str, char target){
        if(str.length() == 0){
            return "";
        }

        char ch = str.charAt(0);

        if(ch == target){
            return skipChar(str.substring(1), target);
        } else {
            return ch + skipChar(str.substring(1), target);
        }

    }
}
