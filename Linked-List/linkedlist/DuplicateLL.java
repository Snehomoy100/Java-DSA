package linkedlist;

public class DuplicateLL {

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
        
    }
}
