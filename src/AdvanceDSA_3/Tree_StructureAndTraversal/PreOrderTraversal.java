package AdvanceDSA_3.Tree_StructureAndTraversal;

public class PreOrderTraversal {
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+"->");
        preOrder(root.left);
        preOrder(root.right);
    }
}

//first print-->then go to left-->then right