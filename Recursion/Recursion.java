public class Recursion {

    // Why we need & use Recursion

    public static void message(){
        System.out.println("Snehomoy Maitra");
        message1();
    }

    public static void message1(){
        System.out.println("Snehomoy Maitra");
        message2();
    }

    public static void message2(){
        System.out.println("Snehomoy Maitra");
        message3();
    }

    public static void message3(){
        System.out.println("Snehomoy Maitra");
        message4();
    }

    public static void message4(){
        System.out.println("Snehomoy Maitra");
    }
    public static void main(String[] args) {
        message();
    }
}
