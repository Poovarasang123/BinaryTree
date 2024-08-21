public class BinarySearchtree {
    Node root;
    class Node{
        int key;
        Node left , right;

        public Node(int val){
            key = val;
            Node left = right = null;
        }
    }
    public BinarySearchtree(int d){
        root = new Node(d);
    }
    public BinarySearchtree(){
        root = null;
    }
    public void insert(int val){
        insert(root,val);
    }
    public Node insert(Node root,int val){
        if(root==null)
            return new Node(val);
        if(val<root.key)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
    }
    public static void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.key+" ");
            inorderTraversal(root.right);
        }
     }
     public Node Search(Node root,int val){
        if(root == null || root.key == val)
            return root;
        if(val < root.key)
            return Search(root.left,val);
        return Search(root.right, val);
     }
     public void delete(int val){
         root = delete(root,val);
     }
     private Node delete(Node root,int val){
        if(root==null){
            return root;
        }
        if(val>root.key){
            root.right = delete(root.right, val);
        }
        else if(val<root.key){
            root.left = delete(root.left,val);
        }
        else{
            if(root.right==null)
                return root.left;
            else if(root.left==null)
                return root.right;
            root.key = min(root.right);
            root.right = delete(root.right, root.key);
        }
        return root;
     }
     public int min(Node root){
        int minval = root.key;
        while(root!=null){
            minval = root.key;
            root = root.left;
        }
        return minval;
     }
}
