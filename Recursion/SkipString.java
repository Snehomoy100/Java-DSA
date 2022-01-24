public class SkipString {
    public static void main(String[] args) {
        String str = "helloiamhola";
        String target = "hola";
        String ans = skipString(str, target);
        System.out.println(ans);
    }

    public static String skipString(String str, String target){
        // base case
        if(str.isEmpty()){ // str.length() = 0
            return "";
        }

        String ch = str.substring(1);

        if(ch.equals(target)){
            return skipString(str.substring(1), target);
        } else {
            return ch + skipString(str, target);
        }
    }
}
