package StackTryy.withll;

public class StackLL {
Node first;

public StackLL(){
    first=null;
}
    public boolean isEmpty(){
    if (first==null){
        return true;
    }
    else
        return false;
    }
       public void top(){
      System.out.println("top: "+first.number);
       }

     public void push(int number){
     Node newNode= new Node(number);
      if (isEmpty()==true){
          first=newNode;
      }
      else {
          newNode.next=first;
          first=newNode;
      }
    }

    public void pop(){
    if (isEmpty()==true){
        System.out.println("Already empty, underflow");
    }
    else{
        first=first.next;
    }
    }

}

