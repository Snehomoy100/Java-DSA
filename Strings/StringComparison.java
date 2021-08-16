public class StringComparison {

    public static void stringComparison(String str, String str1){
        if(str.equals(str1)){
            System.out.println("Both are equal");
        } else{
            System.out.println("Both are not equal");
        }
    }
    public static void main(String[] args) {
        String str = "abc"; // stored inside of string pool
        String str1 = new String("abc"); // stored inside of the Heap memory
        stringComparison(str, str1);
    }
}
