package twodimensionalarrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr = new int[4][5]; // [size of no of row][size or no of coloumn]
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = i * j;
            }
        }
        System.out.println(arr[2][3]); // output: 6
        System.out.println(arr[4][5]); // ArrayIndexOutOfBoundsException
    }
}
