package linkedlist;

import java.util.*;

public class DuplicateLL {

    public static Node<Integer> deleteDuplicate(Node<Integer> head){
        Node<Integer> currentNode = head;
        while(currentNode!=null){
            Node<Integer> nextNode = currentNode.next;
            if(nextNode.data != null && currentNode.data != nextNode.data){
                currentNode = nextNode;
            } else {
                currentNode.next = nextNode.next;
            }
        }
        return currentNode;

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


    public static void main(String[] args) {
        
    }
}
