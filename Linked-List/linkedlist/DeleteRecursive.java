package linkedlist;

import java.util.*;

public class DeleteRecursive {

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

    public static Node<Integer> delElementRecursive(Node<Integer> head, int position){
        // base case 
        if(head == null || position < 0){
            return head;
        }

        if(position == 0){
            return head.next;
        }

        // recursive call
        head.next = delElementRecursive(head.next, position - 1);
        return head;

    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInputLL();
        delElementRecursive(head, 3);
        printLinkedList(head);
    }
}
