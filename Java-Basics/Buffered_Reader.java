import java.io.*;

class Test {
    public static void main(String[] args) throws IOException{

        // User Input through BufferedReader in Java.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Your entered value is: " + x);
    }
}


class Test_2{
    public static void main(String[] args) {
        int x = 10; 
        int y = 20;
        double z = Math.PI;

        // normal outputs in Java.
        System.out.print(x);
        System.out.println(z);


        // used for floating point numbers & formatting them with ease.
        System.out.printf("The value of x is: %d\n", x);
        System.out.printf("The value of y is: %d\n", y);
        System.out.format("Value of PI is: %.2f\n", z);
        System.out.format("Value of PI is: %5.3f\n", z);
        System.out.format("Value of PI is: %08.4f\n", z);

    }
}

