package linkedlist;

import java.util.*;

public class MiddleNode {

    public static void middleNodeLL(Node<Integer> head){
        if(head == null) return;

        Node<Integer> temp = head;
        int indexCount = 0, anotherCount = 0;
        while(temp != null){
            indexCount++;
            temp = temp.next;
        }
        int midIndex = (indexCount/2);
        while(temp != null){
            if(anotherCount == midIndex){
                System.out.println(temp.data + " ");
            }
            anotherCount++;
            temp = temp.next;
        }
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
        middleNodeLL(head);
    }
}
