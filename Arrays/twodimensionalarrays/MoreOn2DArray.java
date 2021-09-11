package twodimensionalarrays;

public class MoreOn2DArray {
    public static void main(String[] args) {
        int[][] arr2d = new int[4][5];
        System.out.println(arr2d); // prints the reference address of the arr2d

        int[][] arr2dTwo = new int[3][];
        for(int i=0; i<arr2dTwo.length; i++){
            System.out.println(arr2dTwo[i]);
        }
        System.out.println(arr2dTwo[1][2]); // throws a NullPointerException


        int[][] arr2dThree = new int[4][];
        for(int i=0; i<arr2dThree.length; i++){
            arr2dThree[i] = new int[i+2]; // initialisation of a 2-D array
        }
        for(int i=0; i<arr2dThree.length; i++){
            for(int j=0; j<arr2dThree[i].length; j++){
                System.out.print(arr2dThree[i][j] + " "); // prints the whole 2-D array
            }
            System.out.println();
        }


        int[][] another2DArray = new int[][4]; // 2-D array can't be created without the no. of rows (no. of rows is mandatory)
        System.out.println(another2DArray[2][3]);
    }
}
