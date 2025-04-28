package AdvanceDSA_3.BST;

public class Find_Element_in_BST {
    public static boolean search(TreeNode root,int target){
        if(root==null){
            return false;
        }

        TreeNode curr=root;
        while(curr!=null){
            if(curr.val==target){
                return true;
            } else if (curr.val<target) {
                curr=curr.right;
            }else {
                curr=curr.left;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        System.out.println(search(root, 4)); // true
        System.out.println(search(root, 6)); // false
    }
}
