package linkedlist;

public class LinkedList {

    public static Node<Integer> createLinkedlist(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        // creation of the linkedlist
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        return n1;

    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedlist();
        System.out.println(head.next);
    }
}
