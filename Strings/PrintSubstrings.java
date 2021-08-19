public class PrintSubstrings {

    public static void printAllSubstrings(String str){
        for(int startIndex=0; startIndex<str.length(); startIndex++){
            for(int endIndex = startIndex; endIndex<str.length(); endIndex++){
                System.out.println(str.substring(startIndex, endIndex + 1)); // because endIndex is exclusive
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        printAllSubstrings(str);
    }
}
