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

    public static void elementInput(Node<Integer> head, int currentIndex, int element){
        // base case 
        if(head == null){
            return;
        }
        // logic part 
        if(currentIndex == 0){
            Node<Integer> current = new Node<Integer>(element);
            head = current;
        }
        // recursive func call
        elementInput(head.next, currentIndex+1, element);
    }

    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInputLL();
        elementInput(head, 0, 20);
        printLL(head);
    }
}
