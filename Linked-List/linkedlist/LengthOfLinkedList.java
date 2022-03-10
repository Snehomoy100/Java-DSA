package linkedlist;

public class LengthOfLinkedList {

    public static Node<Integer> createLinkedlist(){
        
        // linked list creation phase
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);

        // linking phase
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4 = null;

        return n1;
    }

    public static int linkedListLength(Node<Integer> head){
        Node<Integer> temp = head;
        int length = -1; // as the Node no of first element should be 0
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedlist();
        System.out.println(linkedListLength(head));
    }
}
