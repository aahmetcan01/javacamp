package QueueTryy.withll;

public class QueueLL {
    Node first, last;

    public QueueLL(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        if (first==null||last==null){
            return true;
        }
        else
            return false;
    }

    public void enqueue(int number){
        Node newNode=new Node(number);
        if (isEmpty()==true){
            System.out.println("enqueue: "+newNode.number);
            first=newNode;
            last=newNode;
        }
        else {
            System.out.println("enqueue: "+newNode.number);
            last.next=newNode;
            last=newNode;
        }
    }

    public void dequeue(){
        if (isEmpty()==true){
            System.out.println("underflow...");
        }
        else {
            System.out.println("dequeue: " +first.number);
            first=first.next;
        }
    }

    public void showQueue(){
        Node current=first;
        while (current!=null){
            System.out.print(" "+current.number+"=>");
            current=current.next;
        }
    }

}
