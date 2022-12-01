package BST;

public class Main {
    public static void main(String[] args) {
        TreeRecursive bst=new TreeRecursive();
        bst.add(5);
        bst.add(6);
        bst.add(7);
        bst.add(8);
       bst.preorder();
        bst.delete(8);
        System.out.println();
        bst.preorder();
        bst.add(10);
        bst.findMax();
        bst.findMin();
    }
}
