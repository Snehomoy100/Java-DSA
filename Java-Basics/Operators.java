public class Operators {
    public static void main(String[] args){
        // operators
    

        // Artithmetic operators
        int a = 10;
        int b = 12;
        int c = 12;
        int z = (a + b * c); // precidence 
        System.out.println(z);


        // Unary operators
        z = a++; // post increment & similar is the post decrement as well. e.g - z = a--;
        System.out.println(z + " " + a);
        z = ++a; // pre increment & similar is the pre decrement as well. e.g - z = --a;
        System.out.println(z + " " + a);


        // Assignment operators
        int x = 10;
        int y = 5;
        x += y; // => x = x + y
        System.out.println(x);
        x %= y; // x = x % y (% gives the remainder after deviding x with y)
        System.out.println(x);
        int s = x = y; // here comes the associativity with is Right to Left for assignment operators.
        System.out.println(s);
    }
}
