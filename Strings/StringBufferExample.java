public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Snehomoy"); // It is mutable unlike the Strings in Java
        str.setCharAt(6, 'r');
        System.out.println(str);
    }
}
