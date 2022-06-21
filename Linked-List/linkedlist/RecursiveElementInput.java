package linkedlist;

import java.util.*;

public class RecursiveElementInput {

    public static Node<Integer> takeInputLL(){
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = tail.next;
            }
            data = input.nextInt();
        }
        return head;
    }

    public static Node<Integer> elementInput(Node<Integer> head, int position, int element){

        // base case
        if(head == null || position < 0){
            return head;
        }
        
        if(position == 0){
            Node<Integer> current = new Node<Integer>(element);
            current.next = head;
            return current;
        } else{
            head.next = elementInput(head.next, position - 1, element);
            return head;
        }
        
    }

    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInputLL();
        elementInput(head, 2, 20);
        printLL(head);
    }
}
