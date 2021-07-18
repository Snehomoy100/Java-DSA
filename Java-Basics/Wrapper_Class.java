public class Wrapper_Class {
    public static void main(String[] args) {
        Integer x = new Integer(10);
        System.out.println(x);
        int x1 = x; // Auto-Unboxing
        System.out.println(x1);
        Integer x2 = x1; // Auto-Boxing
        System.out.println(x2);
    }
}