package LinkedListt;

public class Main {
    public static void main(String[] args) {
        OurLinkedList list =new OurLinkedList();
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(6);
        list.addLast(9);
        list.printList();
        System.out.println("*************");
        list.addIndex(5,2);
        list.printList();
    }
}
