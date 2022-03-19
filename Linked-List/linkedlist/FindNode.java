package linkedlist;

import java.util.Scanner;

public class FindNode {

    // Time Complexity: O(n)

    public static int returnIndex(Node<Integer> head, int value){
        if(head == null) return -1; // edge case for empty linkedlist

        Node<Integer> temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data == value){
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
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
        Node<Integer> head = takeInput();
        int value = 13;
        System.out.println(returnIndex(head, value));
    }
}
