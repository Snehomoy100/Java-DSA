package linkedlist;

public class MoveNode {

    public static void moveNodesLL(Node<Integer> head, int targetValue){
        Node<Integer> temp = head, nodeHolder = null;
        int index = 0, anotherIndex = 0;
        while(temp != null){
            if(index == 0){
                nodeHolder = temp.next;
            }
            index++;
            temp = temp.next;
        }
        while(temp != null){
            if(anotherIndex + 1 == targetValue){
                Node<Integer> anotherTemp = temp.next;
                while(anotherIndex <= index && anotherTemp != null){
                    if(anotherIndex == index){
                        anotherTemp.next = nodeHolder;
                        nodeHolder = null;
                    }
                    anotherIndex++;
                    anotherTemp = anotherTemp.next;
                }
            }
        }
    }
    public static void main(String[] args){
        
    }
}
