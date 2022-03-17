package linkedlist;

import java.util.Scanner;

public class NodeLinkedList {

    // insert a node in a given linkedlist

    public static Node<Integer> insertNode(Node<Integer> head, int targetIndex, int data){
        Node<Integer> temp = head;
        int indexCount = 0;
        while(temp != null){
            if(indexCount == (targetIndex - 1)){
                Node<Integer> currentNode = new Node<Integer>(data), nextNode = null;
                nextNode = temp.next;
                temp.next = currentNode;
                currentNode.next = nextNode;
            }
            indexCount++;
            temp = temp.next;
        }
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
    
    public static void main(String[] args){
        
    }
}
