
public class PassByValue {
    
    public static int increment(int n){
        n = n + 10;
        return n;
    }
    public static void main(String[] args) {
        int n = 10;
        n = increment(n); // Output: 20
        System.out.println(n); // this prints 10 because of the pass by value 
    }
}
