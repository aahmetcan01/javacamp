package QueueTryy.witharray;

public class Main {
    public static void main(String[] args) {
        QueueArray queueArray=new QueueArray(5);
           queueArray.enqueue(1);
           queueArray.enqueue(2);
           queueArray.enqueue(3);
           queueArray.dequeue();
           queueArray.dequeue();
           queueArray.dequeue();
           queueArray.dequeue();

    }

}
