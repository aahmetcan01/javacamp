package BST;

public class TreeRecursive {
    Node root;

    private Node addRecursive(Node current,int number){
        if (current==null){
            return new Node(number);
        }
        if (number<current.number){
            current.left=addRecursive(current.left,number);

        }
        else if (number> current.number){
            current.right=addRecursive(current.right,number);
        }
        else {
            return current;
        }
            return current;

    }
    public void add(int number){
        root=addRecursive(root,number);
    }
    public void preorder() {
        preorder(root);
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.number + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public Node deletion(Node node,int number){
        if (node==null){
            return null ;
        }
        if (node.number==number){
            if (node.right==null&&node.left==null)return null;
            if (node.left==null&&node.right!=null)return node.right;
            if (node.right==null&&node.left!=null)return node.left;
          Node node1=helper(node.right,node);
          node.number=node1.number;
        }
        else if (number<node.number){
                 node.left=deletion(node.left,number);
        }
        else if (number> node.number){
                 node.right=deletion(node.right,number);
        }
        return node;
    }
    private Node helper(Node node,Node parent){
        Node pre=parent,cur=node;
        while (cur.left!=null){
            pre=cur;
            cur=cur.left;
        }
        deletion(pre,cur.number);
        return cur;
    }
   public void delete(int number){
       deletion(this.root,number);
   }
    public int max(Node node){
        Node current=node;
        while (current.right!=null){
            current=current.right;
        }
        return (current.number);
    }
    public void findMax(){
        System.out.println("max: " +max(this.root));
    }

    public int min(Node node){
        Node current=node;
        while (current.left!=null){
            current=current.left;
        }
        return (current.number);
    }

    public void findMin(){
        System.out.println("min:"+min(this.root));
    }

}

