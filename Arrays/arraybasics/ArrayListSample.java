package arraybasics;

import java.util.*;

// example of ArrayList in Java

public class ArrayListSample {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>(); // by default the capacity is of 10 elements
        arr.add(20); // for adding any element in the ArrayList 
        arr.add(30);
        arr.add(40);

        System.out.println(arr.size()); // for getting the size of the ArrayList
        System.out.println(arr.get(1)); // for accessing a particular element using the index

        arr.add(3, 34);
        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println(arr.get(3));

        arr.set(1, 23);
        System.out.println(arr.get(1)); // for changing a particular element of a particular index

        arr.remove(2); // for removing a particular element at a specific index
        System.out.println(arr.size());

        ArrayList<Integer> arr1 = new ArrayList<>(15); // user specified capacity 15
        arr1.add(2);
        arr1.add(4);
        arr1.add(6);     
        arr1.add(8);
        arr1.add(2, 10); // for adding an element at the specific index

        
        
        // for iterating over ArrayList
        for(int index = 0; index < arr1.size(); index++){
            System.out.println(arr1.get(index));
        }

        System.out.println();

        // for each loop (a better way of getting all the elements stored inside of the ArrayList
        for(int index: arr1){ // here index is the element of the ArrayList itself
            System.out.println(index); 
        }


    }
}
