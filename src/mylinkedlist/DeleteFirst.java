package mylinkedlist;

public class DeleteFirst {
    private Node head ; 

    public voi deleteFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            return ;
        }
        Node FirstNode = head ;
        head = head.next;
        FirstNode = null ;
    }
}