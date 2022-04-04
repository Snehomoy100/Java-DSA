package linkedlist;

import java.util.*;

// Time Complexity: O(n)
// Space Complexity: O(n)

public class ReverseLinkedList {

    public static void reverseLL(Node<Integer> head){

        // base case 
        if(head == null){
            return;
        }

        // recursive call
        reverseLL(head.next);
        System.out.print(head.data + " ");
    }

    public static Node<Integer> userInputLL(){
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        Node<Integer> head = null, tail = null;
        while(data!=-1){
            Node<Integer> currentHead = new Node<Integer>(data);
            if(head == null){
                head = currentHead;
                tail = currentHead;
            } else {
                tail.next = currentHead;
                tail = tail.next;
            }
            data = input.nextInt();
        }
        return head;

    }
    public static void main(String[] args){
        Node<Integer> head = userInputLL();
        reverseLL(head);
    }
}
