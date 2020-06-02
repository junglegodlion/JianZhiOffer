package com.jungle.JianZhiOffer;

import java.util.ArrayList;

public class 二叉搜索树的第k个结点 {

    private ArrayList<TreeNode> arr;
    TreeNode KthNode(TreeNode pRoot, int k)
    {

        if (k<1) {
            return null;
        }
        arr = new ArrayList<>();
        inorder(pRoot);

        if (k>arr.size()) {
            return null;
        }
        return arr.get(k-1);

    }

    private void inorder(TreeNode pRoot) {
        if (pRoot!=null) {
            inorder(pRoot.left);
            arr.add(pRoot);
            inorder(pRoot.right);
        }
    }
}
