package com.jungle.JianZhiOffer;

public class 二叉树的镜像 {

    public void Mirror(TreeNode root) {
       mirror(root);

    }

    // 这样写确是错的，好好体会一下
//    private TreeNode mirror(TreeNode root) {
//        if(root == null) {
//            return null;
//        }
//        root.left = mirror(root.right);
//        root.right = mirror(root.left);
//
//        return root;
//    }

    private TreeNode mirror(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode leftNode = mirror(root.right);
        TreeNode rightNode = mirror(root.left);

        root.left = leftNode;
        root.right = rightNode;
        return root;
    }
}
