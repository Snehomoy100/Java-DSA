public class Java_Output {
    public static void main(String[] args) {
        int x = 10; 
        int y = 20;
        double z = Math.PI;

        // normal outputs in Java.
        System.out.println("Snehomoy");
        System.out.println(x);
        System.out.println(z);


        // used for floating point numbers & formatting them with ease.
        System.out.printf("The value of x is: %d\n", x);
        System.out.printf("The value of y is: %d\n", y);
        System.out.format("Value of PI is: %.2f\n", z);
        System.out.format("Value of PI is: %05.3f\n", z);
        System.out.format("Value of PI is: %08.4f\n", z);
        System.out.format("Value of PI is: %08.5f\n", z);

    }
}
