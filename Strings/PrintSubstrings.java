public class PrintSubstrings {

    // First Approach
    public static void printAllSubstrings(String str){
        for(int startIndex=0; startIndex<str.length(); startIndex++){
            for(int endIndex = startIndex; endIndex<str.length(); endIndex++){
                System.out.println(str.substring(startIndex, endIndex + 1)); // because endIndex is exclusive
            }
        }
    }

    // Second Approach
    public static void allSubstrings(String str){
        for(int len=1; len<=str.length(); len++){
            for(int start=0; start<=str.length()-len; start++){
                int end = (start + len) - 1;
                System.out.println(str.substring(start, end + 1));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        allSubstrings(str);
    }
}
