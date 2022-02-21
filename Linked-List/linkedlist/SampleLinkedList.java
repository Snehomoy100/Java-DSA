package linkedlist;

public class SampleLinkedList {

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        node2.next = node1;
        print(node2); // prints 20 10
    }
}
