public class PowerOfNum {

    public static int power(int number, int power){
        if(power == 0){
            return 1;
        }

        int res = 1;
        res = res * number;
        return power(number, power-1);
    }
    public static void main(String[] args) {
        int ans = power(2, 3);

        
        System.out.println(ans);
    }
}
