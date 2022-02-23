package linkedlist;

import java.util.*;

public class PrintNode {

    public static Node<Integer> createLL(){
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        Node<Integer> n5 = new Node<Integer>(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        return n1;

    }

    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }

    public static void printNode(Node<Integer> head, int index){
        Node<Integer> temp = head;
        int count = -1;

        while(temp != null){
            count++;
            if(count == index){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
        if(index > count){
            System.out.println("The index is out of range...!");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Node<Integer> head = createLL();
        int index = input.nextInt();
        printNode(head, index);
        input.close();
    }
}