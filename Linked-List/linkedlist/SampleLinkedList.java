package linkedlist;

class SampleLinkedList {

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        node1.next = node2;
        increment(node1);
        print(node2); // prints 11 21
    }
}


class AnotherSample {

    public static int ansLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        int storedAns = 0;
        while(temp != null){
            storedAns = storedAns + ((temp.data * 10) + temp.next.data);
            temp = temp.next;
        }
        return storedAns;
    }
    public static void main(String[] args) {
        
    }
}