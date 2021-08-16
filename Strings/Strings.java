public class Strings {
    public static void main(String[] args) {
        char arr[] = {'C', 'o', 'd', 'i', 'n', 'g'}; // Strings are char arrays under the hood
        System.out.println(arr[4]);

        // Strings are char arrays under the hood
        String str1 = "Sneho mo y";
        String str2 = " Snehomoya "; // empty string
        System.out.println(str2.trim()); // removes the spaces from the beginning & end of a String
        String str3 = " "; // string with only one element
        System.out.println(str3.length()); // returns the length of the String
        System.out.println(str1.charAt(3)); // to get a char in a particular index
        System.out.println(str1.contains(str3)); // return type is boolean
        System.out.println(str1.compareTo(str2)); // return type is integer
        System.out.println(str1.compareToIgnoreCase(str2)); // result is not case sensitive
        System.out.println(str1.valueOf(7));
        System.out.println(str2.toCharArray()); // returns the char Array which backs the Strings in Java


        // How string is being stored inside of the memory
        String str = "abcd"; // stored inside of String Pool in the heap memory
        str = "hoola"; // Concatination is allowed but change of any char inside of the string is not allowed in Java
        System.out.println(str.indexOf('a')); // to get the index of a specific character
        String newStr = new String("abcd"); // stored inside of the Heap memory
        // newStr.setCharAt(3) = "g"; // Strings are immutable in java
        System.out.println(str == newStr); // returns false

    }
}
