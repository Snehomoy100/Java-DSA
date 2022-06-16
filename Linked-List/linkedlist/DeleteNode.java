package linkedlist;

import java.util.*;

public class DeleteNode {

    // Delete a node from a linkedlist
    // Time Complexity: O(n)
    
    public static Node<Integer> insertNode(Node<Integer> head, int targetIndex){
        if(head == null) return null; // edge case 1

        Node<Integer> temp = head;
        int indexCount = 0;
        while(temp != null){
            if(indexCount == (targetIndex - 1)){
                temp.next = temp.next.next;
            }
            indexCount++;
            temp = temp.next;
        }

        if(targetIndex > indexCount) return null; // edge case 2

        return head;
    }

    public static Node<Integer> takeInput(){
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
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


    
    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insertNode(head, 7);
        printLL(head);
    }
}
