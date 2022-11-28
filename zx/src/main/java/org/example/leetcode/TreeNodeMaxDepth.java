package org.example.leetcode;

public class TreeNodeMaxDepth {
    int res=0;// 记录最大深度，
    int depth=0;//记录遍历到的节点位置深度，
    public int maxDepth(TreeNode root) {
        travels( root);
        return res;

    }
    private void travels(TreeNode root){
        if (root==null){
            return ;
        }
        depth++;// 前序位置进入一个节点的时候。
        if (root.left==null && root.right==null){
            // 到达叶子节点，更新最大深度
            res=Math.max(res,depth);

        }
        travels(root.left);
        travels(root.right);
        depth--;//后序位置离开一个节点的时候


    }
}
