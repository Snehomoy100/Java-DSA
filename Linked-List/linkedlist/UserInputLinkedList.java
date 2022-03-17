package linkedlist;

import java.util.Scanner;

public class UserInputLinkedList {

    // taking user input as the elements of Linked List

    public static void printLinkedlist(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> takeInput(){
        Scanner input 
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedlist(head);
    }
}
