public class CountWords {

    public static int countWords(String str){
        int counter = 0;
        for(int i=0; i<str.length(); i++){
            char character = str.charAt(i);
            if(character == ' '){
                counter++;
            }
        }

        return (counter + 1);
    }
    public static void main(String[] args) {
        String str = "Snehomoy Maitra is a good guy.";
        int wordCount = countWords(str);
        System.out.println(wordCount);
    }
}
