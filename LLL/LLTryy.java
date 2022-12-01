package LLL;

public class LLTryy {
    Node head;
    Node tail;

    public LLTryy(){
        head=null;
        tail=null;
    }

    public boolean isEmpty(){
        if (head==null){
            return true;
        }
        else
            return false;
    }

    public void addFirst(int number){
        Node newNode=new Node(number);
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
            newNode.next=null;
            tail.next=newNode;
            tail=newNode;
    }

    public void print(){
       Node current=head;
        while (current!=null){
            System.out.print(" "+current.number +" =>");
           current=current.next;

        }
    }
    public void addIndex(int number,int index){
        Node newNode=new Node(number);
        if (isEmpty()==true){
            addFirst(number);
        }
        else {
            Node current1=null;
            Node current2=head;
            int hereIndex=0;
            while (current2!=null&&hereIndex<index){
                current1=current2;
                current2=current2.next;
                hereIndex++;
            }
            if (current2==null){
                addLast(number);
            }
            else
                current1.next=newNode;
                newNode.next=current2;
        }

    }
    public void remove(int index){
        Node newNode=new Node(index);
        if (isEmpty()==true){
            System.out.println("Linked List already null");
        }
        else{
            if (index==0){
                head=head.next;
            }
            else{
                Node current1=null;
                Node current2=head;
                int hereIndex=0;
                while (current2!=null&&hereIndex<index){
                    current1=current2;
                    current2=current2.next;
                    hereIndex++;
                }
               if (index!=tail.number){
                   current1.next=current2.next;
                   current2=current2.next;
               }
               else
                  current1.next=null;
               current1=current2;
               tail=current1;
            }


        }
    }
}
