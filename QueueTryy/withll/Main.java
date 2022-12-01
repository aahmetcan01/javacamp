package QueueTryy.withll;

public class Main {
    public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.showQueue();
        q.enqueue(6);
        q.dequeue();
        q.showQueue();
    }
}
