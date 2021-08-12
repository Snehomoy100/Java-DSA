public class Strings {
    public static void main(String[] args) {
        char arr[] = {'C', 'o', 'd', 'i', 'n', 'g'};
        System.out.println(arr[4]);

        // Strings are char arrays under the hood
        String str1 = "Snehomoy";
        String str2 = ""; // empty string
        System.out.println(str2.length());
        String str3 = " "; // string with only one element
        System.out.println(str3.length());
        System.out.println(str1.charAt(3));
        System.out.println(str1.length());
        System.out.println(str1.contains(str3)); // return tyoe is boolean
    }
}
