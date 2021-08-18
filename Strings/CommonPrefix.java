public class CommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = "";
        for(int i=0; i<strs.length; i++){
            for(int j=0; j<strs[i].length(); j++){
                if(strs[i].charAt(j) == strs[i+1].charAt(j)){
                    prefix += strs[i].charAt(j);
                }
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"apple", "apps", "ape"};
        String output = longestCommonPrefix(strs);
        System.out.println(output);
    }
}
