package problemsonarray;

import java.util.Arrays;

public class ArrayIntersection {

    // Time Complexity: O(n)

    public static void arrayIntersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr2[j] + " ");
                i += 1;
                j += 1;
            } else if(arr2[j] > arr1[i]){
                i+=1;
            } else{
                j+=1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {34, 2, 9, 43, 2, 0, 21};
        int[] arr2 = {78, 23, 89, 0, 2, 12};

        arrayIntersection(arr1, arr2);
    }
}
