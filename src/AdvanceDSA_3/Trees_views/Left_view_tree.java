package AdvanceDSA_3.Trees_views;

import java.util.LinkedList;
import java.util.Queue;

public class Left_view_tree {
    public static void LeftView(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(q.isEmpty()==false){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();

                if(i==0){
                    System.out.print(curr.val+" ");
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

        Left_view_tree.LeftView(root);
    }
}
