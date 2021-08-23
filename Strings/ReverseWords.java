public class ReverseWords {

    public static String reveString(String str){

        // one of the best approach
        
        String result = "";
        int i = 0;
        int n = str.length();
        while(i<n){
            while(i < n && str.charAt(i) == ' '){
                i++;
            }
            int j = i + 1;
            while(j < n && str.charAt(j) != ' '){
                j++;
            }
            String word = str.substring(i, j);
            if(result.length() == 0){
                result = word;
            } else{
                result = word + " " + result;
            }
            i = j+1;
        }

        return result;
    }
    public static void main(String[] args) {
        String str = "I am a good guy";
        String result = reveString(str);
        System.out.println(result);
    }
}
