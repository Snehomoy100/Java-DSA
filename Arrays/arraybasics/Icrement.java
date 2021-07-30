package arraybasics;
public class Icrement {
    // Pass by value example in non-primitives

    public static int[] arrayIncrement(int arr[]) {

        // System.out.println(arr); // this arr & the arr from main func is referring to the same reference
        arr = new int[8];
        for(int index = 0; index < arr.length; index++){
            arr[index] += 1;
        }
        return arr;
    }



    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        arr = arrayIncrement(arr);

        // System.out.println(arr); // this arr & the arr from main func is referring to the same reference

        printArray(arr);
    }
}
