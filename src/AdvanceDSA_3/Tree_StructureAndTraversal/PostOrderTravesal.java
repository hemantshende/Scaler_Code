package AdvanceDSA_3.Tree_StructureAndTraversal;

public class PostOrderTravesal {
    public void postOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+"->");
    }
}
