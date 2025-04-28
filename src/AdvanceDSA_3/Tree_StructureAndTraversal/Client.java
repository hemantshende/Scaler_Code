package AdvanceDSA_3.Tree_StructureAndTraversal;

public class Client {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        //pre-order
        System.out.println("pre-order");
        PreOrderTraversal preOrderTraversal=new PreOrderTraversal();
        preOrderTraversal.preOrder(root);
        System.out.println();

        //in-order
        System.out.println("in-order");
        InOrderTraversal inOrderTraversal=new InOrderTraversal();
        inOrderTraversal.inOrderTraversal(root);
        System.out.println();

        //post-order
        System.out.println("post-order");
        PostOrderTravesal postOrderTravesal=new PostOrderTravesal();
        postOrderTravesal.postOrderTraversal(root);
    }
}
