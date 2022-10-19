package LinkedListt;

public class OurLinkedList {
    Node head;
    Node tail;

    public OurLinkedList(){
        head =null;
        tail =null;
    }

    public boolean isEmpty(){
        if (head==null){
            return true;
        }
        else
            return false;
    }

public void addFirst(int number){
    Node newNode= new Node(number);
        if (isEmpty()==true){
          head=newNode;
          tail=newNode;
        }
        else
            newNode.next=head;
            head=newNode;
}
public void addLast(int number){
        Node newNode=new Node(number);
        if (isEmpty()==true){
            head=newNode;
            tail=newNode;
        }
        else
            tail.next=newNode;
            tail=newNode;
            newNode.next=null;

}

public void printList(){
        Node current=head;

        while (current!=null){
            System.out.print(current.number + "  ");
            current=current.next;
        }
}

public void addIndex(int number ,int index){
    Node newNode=new Node(number);
    if (isEmpty()==true){
        head=newNode;
        tail=newNode;
    }
    else{
        if (index==0){
            addFirst(number);
        }
        else{
            Node current1=null;
            Node current2=head;
            int hereIndex=0;
            while (current2!=null && hereIndex<index){
                current1=current2;
                current2=current2.next;
                hereIndex++;
            }
              if (current2==null){
                  addLast(number);
              }
              else
                  newNode.next=current2;
                  current1.next=newNode;
        }

    }




}


}

