package arraybasics;

import java.util.*;
import java.io.*;

// remove the consequtive duplicates from an array & store the non-duplicate elements in an ArrayList

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>(arr.length);
        ans.add(arr[0]);
        for(int i=1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                ans.add(arr[i]);
            }
        }

        return ans;
    }


    public static void printArrayList(ArrayList<Integer> arr){
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 20, 30, 30,30 ,30, 40, 40};
        ArrayList<Integer> res = removeDuplicates(arr);
        printArrayList(res);
    }
}
