public class Strings {
    public static void main(String[] args) {
        char arr[] = {'C', 'o', 'd', 'i', 'n', 'g'};
        System.out.println(arr[4]);

        // Strings are char arrays under the hood
        String str1 = "Sneho mo y";
        String str2 = "Snehomoya"; // empty string
        System.out.println(str2.length());
        String str3 = " "; // string with only one element
        System.out.println(str3.length());
        System.out.println(str1.charAt(3));
        System.out.println(str1.length());
        System.out.println(str1.contains(str3)); // return type is boolean
        System.out.println(str1.compareTo(str2)); // return type is integer

        // How string is being stored inside of the memory
        String str = "abcd"; // stored inside of String Pool in the heap memory
        str = "hoola";
        String newStr = new String("abcd"); // stored inside of the Heap memory
        newStr.setCharAt(3) = "g"; // Strings are immutable in java
        System.out.println(str == newStr); // returns false

    }
}
