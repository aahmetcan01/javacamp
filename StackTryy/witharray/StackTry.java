package StackTryy.witharray;

public class StackTry {
    int capacity;
    int top;
    int [] arr;

    StackTry(int capacity){
        this.capacity=capacity;
       arr=new int[capacity];
        top=-1;
    }

    public void push(int number){
        if (top==capacity-1){
            System.out.println("overflow");
        }
        else {
           top++;
           arr[top]=number;
            System.out.println(arr[top]);
        }
    }
    public void pop(){
           if (top<0){
               System.out.println("underflow");
           }
           else {
               top--;

           }
    }
    public void top(){
        System.out.println("top: " +arr[top]);
    }

}
