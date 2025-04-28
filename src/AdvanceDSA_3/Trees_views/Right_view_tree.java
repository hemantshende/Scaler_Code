package AdvanceDSA_3.Trees_views;

import java.util.LinkedList;
import java.util.Queue;

public class Right_view_tree {
    public static void rightView(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(q.isEmpty()==false){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();

                if(i==size-1){                      //it simple level order traversal
                    System.out.print(curr.val+" "); //only print last element of every level
                }

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.rigth!=null){
                    q.add(curr.rigth);
                }
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.rigth=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.rigth=new TreeNode(5);
        root.rigth.left=new TreeNode(6);
        root.rigth.rigth=new TreeNode(7);

        Right_view_tree.rightView(root);
    }
}
