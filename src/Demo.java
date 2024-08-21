public class Demo {
    public static void main(String[] args) {
        // BinaryTree tree = new BinaryTree(10);
        // tree.insertLeft(tree.root, 5);
        // tree.insertRight(tree.root, 15);
        // tree.insertLeft(tree.root.left, 3);
        // tree.insertRight(tree.root.left, 8);
        // tree.insertLeft(tree.root.right, 12);

        // tree.preorderTraversal(tree.root);
        // System.out.println();
        // tree.inorderTraversal(tree.root);
        // System.out.println();
        // tree.postorderTraversal(tree.root);

        BinarySearchtree tree = new BinarySearchtree(10);
        tree.insert(50);
        tree.insert(20);
        tree.insert(25);
        tree.insert(70);
        tree.insert(75);
        tree.insert(90);
        tree.insert(80);
        tree.insert(65);
       tree.inorderTraversal(tree.root);
       
       if(tree.Search(tree.root, 8)!=null){
        System.out.println("found");
       }
       else System.out.println("Not found");
       tree.delete(tree.root, 25);
       tree.inorderTraversal(tree.root);
    }
}
