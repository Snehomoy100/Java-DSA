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
        System.out.println(z + ' ' + a);
        z = ++a; // pre increment & similar is the pre decrement as well. e.g - z = --a;
        System.out.println(z + ' ' + a);
    }
}
