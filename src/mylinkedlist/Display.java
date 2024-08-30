package mylinkedlist;

public class Display{
    private Node head ;

    public void display(int data){
        Node newNode = new Node(data);

        Node current = head ;
        if(current==null){
            return;
        }
        while(current != null){
            System.out.print(current.data);
            current= current.next;
            }
        }
        
    }
