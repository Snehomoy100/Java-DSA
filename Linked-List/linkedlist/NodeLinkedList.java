package linkedlist;

import java.util.Scanner;

public class NodeLinkedList {

    // Insert a node in a given linkedlist
    // Time Complexity: O(n)

    public static Node<Integer> insertNode(Node<Integer> head, int targetIndex, int data){
        if(head == null) return null; // edge case 1

        Node<Integer> temp = head;
        int indexCount = 0;
        while(temp != null){
            if(indexCount == (targetIndex - 1)){
                Node<Integer> currentNode = new Node<Integer>(data), nextNode = null;
                nextNode = temp.next; // for the connection memorizing purposes 
                temp.next = currentNode;
                currentNode.next = nextNode;
            }
            indexCount++;
            temp = temp.next;
        }

        if(targetIndex > indexCount) return null; //edge case 2

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

    public static void main(String[] args){
        Node<Integer> head = takeInput();
        head = insertNode(head, 2, 3);
        printLL(head);
    }
}
