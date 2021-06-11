public class PassByValue {
    
    public static int increment(int n){
        n = n + 10;
        return n;
    }
    public static void main(String[] args) {
        int a = 10;
        increment(a);
        System.out.println(a); // this prints 10 because of the pass by value
    }
}
