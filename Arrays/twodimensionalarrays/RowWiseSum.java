package twodimensionalarrays;

import java.util.Scanner;

public class RowWiseSum {

    public static void rowWiseSum(int[][] arr2d){
        int rows = arr2d.length;
        int cols = arr2d[0].length;

        if(rows == 0){ // arr2d.length = 0
            return;
        }

        for(int i=0; i<rows; i++){
            int rowSum = 0;
            for(int j=0; j<cols; j++){
                rowSum += arr2d[i][j];
            }
            System.out.println(rowSum + " ");
        }
    }
    
    
    public static int[][] takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the no. of cols: ");
        int cols = input.nextInt();
        int[][] arr2d = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr2d[i][j] = input.nextInt();
            }
        }

        return arr2d;
    }


    public static void printArray(int[][] arr2d){
        int rows = arr2d.length;
        int cols = arr2d[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr2d = takeInput();
        printArray(arr2d);
        rowWiseSum(arr2d);
    }
}
