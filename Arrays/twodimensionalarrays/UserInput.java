package twodimensionalarrays;

import java.util.Scanner;

class UserInput {

    // How to take 2-D Array input in Java (row-wise)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the no. of cols: ");
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = input.nextInt();
            }
        }

        // print the 2-D array (row-wise)
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}


class ColoumnWise{

    // user input in 2-D array (coloumn-wise)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of cols: ");
        int cols = input.nextInt();
        System.out.println("Enter the no. of rows: ");
        int rows = input.nextInt();
        int[][] arr = new int[cols][rows];
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                arr[i][j] = input.nextInt();
            }
        }

        // print the 2-D array (coloumn-wise)
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
