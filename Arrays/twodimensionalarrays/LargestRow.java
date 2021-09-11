package twodimensionalarrays;

import java.util.Scanner;

public class LargestRow {

    public static void largestRowOrColumn(int[][] arr2d){
        int maxSum = Integer.MIN_VALUE;
        int idx = 0;
        boolean isRow = false;
        int rowLength = arr2d.length;
        int colLength = arr2d[0].length;

        // calculation of column wise sum
        for(int i=0; i<rowLength; i++){
            int rowSum = 0;
            for(int j=0; j<colLength; j++){
                rowSum += arr2d[i][j];
            }
            if(rowSum > maxSum){
                maxSum = rowSum;
                idx = i;
                isRow = true;
            }
        }

        // calculation of column wise sum
        for(int i=0; i<colLength; i++){
            int colSum = 0;
            for(int j=0; j<rowLength; j++){
                colSum += arr2d[i][j];
            }
            if(colSum > maxSum){
                maxSum = colSum;
                idx = i;
                isRow = false;
            }
        }

        if(isRow){
            System.out.println("row " + idx + " " + maxSum);
        } else{
            System.out.println("column " + idx + " " + maxSum);
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
        for(int i=0; i<arr2d.length; i++){
            for(int j=0; j<arr2d[i].length; j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr2d = takeInput();
        largestRowOrColumn(arr2d);
    }
}
