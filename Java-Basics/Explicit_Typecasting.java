public class Explicit_Typecasting {
    public static void main(String[] args) {
        int a = 1;
        long b = a;
        b = 813427581751L;
        a = (int) b; // explicit typecasting done by us .
        System.out.println(a);
    }
}
