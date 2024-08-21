public class BinaryTree{
    Node root;
    class Node{
        int data;
        Node left , right;

    public Node(int val){
        data = val;
        left = null;
        right = null;
    }
  }
  public BinaryTree(int d){
    root = new Node(d);
  }
  public void insertLeft(Node r,int val){
           Node newNode = new Node(val);
           r.left = newNode;
        }
  public void insertRight(Node r,int val){
    Node newNode = new Node(val);
    r.right = newNode;
  }

  public static void preorderTraversal(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
  }
  public static void inorderTraversal(Node root){
    if(root!=null){
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
 }
 public static void postorderTraversal(Node root){
    if(root!=null){
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");
    }
 }
}