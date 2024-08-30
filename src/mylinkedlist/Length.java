package mylinkedlist;

public class Length{
    private Node head;

    public void length(int data){
        Node newNode = new Node(data);
        int count = 0;
        Node length = head;
        if(length != null){
            length = length.next;
            count++;
        }
        return count;

    }
}
