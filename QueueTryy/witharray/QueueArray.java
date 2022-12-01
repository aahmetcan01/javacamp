package QueueTryy.witharray;

public class QueueArray {
    int [] arr;
    int first, last, capacity,currentSize;

    QueueArray(int capacity){
        first=0;
        last=-1;
        currentSize=0;
        this.capacity=capacity;
        arr=new int[capacity];
    }
    boolean isEmpty(){
        return currentSize==0;
    }
    boolean isFull(){
        return currentSize==capacity;
    }

    void enqueue(int number){
        if (isFull()){
            System.out.println("overflow...");
        }
        else {
            System.out.println("added: " +number);
            last=last+1;
            arr[last]=number;
            currentSize++;
        }
    }

    void dequeue(){
        if (isEmpty()){
            System.out.println("underflow...");
        }
        else {
            System.out.println("dequeue: " +arr[first]);
            first=first+1;
            currentSize--;


        }
    }
}
