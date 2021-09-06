package twodimensionalarrays;

public class Storage {
    
    // How 2-D arrays are actually stored inside of memory

    public static void main(String[] args) {
        int[][] arr2d = {{1,2,3,4}, {4,5,6,7}, {7,8,9,10}}; // initialisaton of 2-D arrays
        System.out.println(arr2d); // referce address of the 2-D array
        System.out.println(arr2d[0]); // referce address of the first array stored inside of the 2-D array
        System.out.println(arr2d[1][3]); // prints the element present at the 2nd array's 3rd index stored inside of the 2-D array
        System.out.println(arr2d.length); // prints - 3 (This returns the no. of rows present in a 2-D array)
        System.out.println(arr2d[2].length); // prints the length of the array present at 2nd index inside of the 2-D array

    }
}
