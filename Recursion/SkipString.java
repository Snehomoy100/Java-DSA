class SkipString {
    public static void main(String[] args) {
        String str = "helloiamsnehomoy";
        String target = "hello";
        String ans = skipString(str, target);
        System.out.println(ans);
    }

    public static String skipString(String str, String target){
        // base case
        if(str.isEmpty()){ // str.length() = 0
            return ""; // returns an empty string
        }

        if(str.startsWith(target)){
            return skipString(str.substring(target.length()), target);
        } else {
            return (str.charAt(0) + skipString(str.substring(1), target));
        }
    }
}


class SkipSpecialString {
    public static void main(String[] args) {
        System.out.println(skipSpecialString("helloiamsnehomoy", "sne", "snehomoy"));
    }

    public static String skipSpecialString(String str, String target, String subTarget){
        // base case 
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith(subTarget) && str.startsWith(target)){
            return skipSpecialString(str.substring(subTarget.length()), target, subTarget);
        } else{
            return (str.charAt(0) + skipSpecialString(str.substring(1), target, subTarget));
        }
    }
}