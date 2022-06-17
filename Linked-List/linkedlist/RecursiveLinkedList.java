package linkedlist;

import java.util.*;

// printing the linkedlist in recursive format

public class RecursiveLinkedList {

    // so all the func calls will be stored inside of the call stack 
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

    public static void printLLRecursive(Node<Integer> head){
        // base case
        if(head == null){
            return;
        }

        System.out.print(head.data + " ");
        printLLRecursive(head.next); // recursive call
    }

    public static void recursiveReverseLL(Node<Integer> head){
        // base case 
        if(head == null){
            return;
        }

        recursiveReverseLL(head.next); // recursive call
        System.out.print(head.data + " "); // elements are getting printed
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInputLL();
        // printLLRecursive(head);
        recursiveReverseLL(head);
    }
}
