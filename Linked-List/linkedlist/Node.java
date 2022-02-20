package linkedlist;

public class Node<T> { // <> are the generics
    T data; // the data is being stored inside the linkedlist
    Node<T> next; // this is an empty object which has null as the value
    Node(T data){
        this.data = data;
    }
    
}
