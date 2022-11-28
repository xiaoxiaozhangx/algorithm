package org.example.leetcode;
//https://leetcode.cn/problems/diameter-of-binary-tree/
public class TreeNodeMaxDiameter {
    // 求最大直径 包括求左右子树直径，是后序遍历
    //类似最大深度，
    int maxDiameter=0;
    public int  diameterOfBinaryTree(TreeNode treeNode){
        traverl(treeNode);
        return maxDiameter;
    }
    private int traverl(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftDiameter=traverl(root.left);
        int rightDiameter=traverl(root.right);
        // 后序位置，顺便计算最大直径

        int nowDiamerter=leftDiameter+rightDiameter;
        maxDiameter=Math.max(maxDiameter,nowDiamerter);
        return 1+Math.max(leftDiameter,rightDiameter);

    }

}
