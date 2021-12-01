import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 3, 56, 0, 6, 0};
        System.out.println(linearSearch(arr, 0, 0)); // from 0th index
        System.out.println(linearSearchFromLast(arr, arr.length - 1, 56)); // from (n - 1)th index
        linearSearchMultipleOccurances(arr, 0, 0); // for multiple occurances of the same value using ArrayList
        System.out.println(list);
        linearSearchArrayList(arr, 0, 0, new ArrayList<>()); // passing ArrayList as an argument
        System.out.println(list);
        System.out.println(linearSearchWithoutPassing(arr, 0, 0)); // without passing the arraylist as an argument
        
    }

    public static int linearSearch(int[] arr, int index, int x){
        // base case
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == x){
            return index;
        } else{
            return(linearSearch(arr, index + 1, x));
        }
    }


    public static int linearSearchFromLast(int[] arr, int index, int x){
        // base case
        if(index == -1){
            return -1;
        }

        if(arr[index] == x){
            return index;
        } else{
            return(linearSearchFromLast(arr, index - 1, x));
        }
    }


    public static ArrayList<Integer> list = new ArrayList<>();
    public static void linearSearchMultipleOccurances(int[] arr, int index, int x){
        // base case
        if(index == arr.length){
            return;
        }

        if(arr[index] == x){
            list.add(index);
        } 
        linearSearchMultipleOccurances(arr, index + 1, x);
    }


    public static ArrayList<Integer> linearSearchArrayList(int[] arr, int index, int x, ArrayList<Integer> list){
        // passing ArrayList as an argument in the recursive function
        if(index == arr.length){
            return list;
        }

        if(arr[index] == x){
            list.add(index);
        }

        return(linearSearchArrayList(arr, index + 1, x, list));
    }


    // TODO: the most important part
    public static ArrayList<Integer> linearSearchWithoutPassing(int[] arr, int index, int x){ // without passing the ArrayList as an argument
        ArrayList<Integer> ans = new ArrayList<>();

        // base case
        if(index == arr.length){
            return ans;
        }

        // calculations
        if(arr[index] == x){
            ans.add(index);
        }

        ArrayList<Integer> smallAns = linearSearchWithoutPassing(arr, index + 1, x);

        ans.addAll(smallAns);

        return ans;

    }
}
