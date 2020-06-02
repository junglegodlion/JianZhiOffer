package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 从上往下打印二叉树 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        if (root==null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode v = queue.remove();
            list.add(v.val);
            if (v.left!=null) {
                queue.add(v.left);
            }
            if (v.right!=null) {
                queue.add(v.right);
            }
        }

        return list;
    }

}
