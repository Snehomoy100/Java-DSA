public class Icrement {
    // Pass by value example in non-primitives

    public static void arrayIncrement(int arr[]) {

        arr[0] = 15; // this arr & the arr from main func is referring to the same reference
        for(int index = 0; index < arr.length; index++){
            arr[index] += index;
        }
    }

    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        arrayIncrement(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
