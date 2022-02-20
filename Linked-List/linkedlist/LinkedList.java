package linkedlist;

public class LinkedList {

    // creating a linkedlist
    public static Node<Integer> createLinkedlist(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        // creation of the linkedlist
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null; // next for the last element would be null

        return n1;

    }

    // printing a linkedlist
    public static void printLinkedlist(Node<Integer> head){
        System.out.println(head.data); // prints the first element
        System.out.println(head.next.data); // prints the 2nd element
        System.out.println(head.next.next.data); // prints the 3rd element
        System.out.println(head.next.next.next.data); // prints the 4th element
    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedlist();
        printLinkedlist(head);
    }
}
