package com.jungle.JianZhiOffer;

public class 二叉树的深度 {

    public int TreeDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
}
