// Just a demo file


class Demo {
    public static void demo(int a, int b){
		System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
		int a = 5;
		int b = 15; 
		demo(a);
    }
}

class PrimeTwoToN {

    public static boolean isPrime(int n){
        int d = 2;
        for(int i = 1; i <= n; i++){
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }


    public static void printTwoToN(int n){
        for(int i = 2; i <= n; i++){
            boolean iIsPrime = isPrime(i); // function calling inside on another function
            if (iIsPrime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printTwoToN(100);
    }
}

class Example {
    public static void func(int a) {
        int b = 10;
        a = a + 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        func(a);
        System.out.println(a);
    }
}