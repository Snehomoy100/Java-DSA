package linkedlist;

public class FindNode {

    public static int returnIndex(Node<Integer> head, int value){
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
    public static void main(String[] args) {
        
    }
}
