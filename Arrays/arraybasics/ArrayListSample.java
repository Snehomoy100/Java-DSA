package arraybasics;

import java.util.ArrayList;

// example of ArrayList in Java

public class ArrayListSample {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
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
    }
}
