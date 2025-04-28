package AdvanceDSA_3.Tree_StructureAndTraversal;

public class InOrderTraversal {
    public void inOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+"->");
        inOrderTraversal(root.right);
    }
}

//first go to left-->print value-->then go to right
