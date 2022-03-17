package linkedlist;

import java.util.Scanner;

class UserInputLinkedListBruteForce {

    // O(n^2) approach
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
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        Node<Integer> head = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
                head = currentNode;
            } else{
                Node<Integer> tail = head;
                while(tail.next != null){
                    tail = tail.next;
                }
                tail.next = currentNode; 
            }
            data = input.nextInt();           
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedlist(head);
    }
}




class UserInputLinkedListOptimal {

    // O(n) approach

    public static void printLinkedlist(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> takeInput(){
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;

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
        Node<Integer> head = takeInput();
        printLinkedlist(head);
    }
}