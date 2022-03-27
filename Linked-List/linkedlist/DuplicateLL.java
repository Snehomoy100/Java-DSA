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
    public static void main(String[] args) {
        
    }
}
