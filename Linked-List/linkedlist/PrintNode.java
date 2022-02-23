package linkedlist;

public class PrintNode {

    public static Node<Integer> createLL(){
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        Node<Integer> n5 = new Node<Integer>(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        return n1;

    }

    public static void printNode(Node<Integer> head, int index){
        Node<Integer> temp = head;
        int count = -1;

        while(temp != null){
            if(count == index){
                System.out.println(temp.data);
            }
            count++;
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        
    }
}