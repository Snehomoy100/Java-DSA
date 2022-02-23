package linkedlist;

public class LengthOfLinkedList {

    public static Node<Integer> createLinkedlist(){
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);

        return n1;
    }

    public static int linkedListLength(Node<Integer> head){
        Node<Integer> temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedlist();
        System.out.println(linkedListLength(head));
    }
}
