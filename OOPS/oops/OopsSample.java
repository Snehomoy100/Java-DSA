package oops;

public class OopsSample {
    public static void main(String[] args){
        for(int row = 1; row <= 9; row++){
            for(int col = 1; col <= row; col++){
                System.out.println(col + " ");
            }
            System.out.println();
        }
    }
}
