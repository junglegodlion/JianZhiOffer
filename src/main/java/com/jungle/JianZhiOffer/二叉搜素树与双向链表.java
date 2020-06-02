package com.jungle.JianZhiOffer;

import java.util.ArrayList;

public class 二叉搜素树与双向链表 {

//    ArrayList<TreeNode> list = new ArrayList<>();
//
//    public TreeNode Convert(TreeNode pRootOfTree) {
//
//        if (pRootOfTree==null) {
//            return null;
//        }
//
//        ArrayList<TreeNode> treeNodes = inOrder(pRootOfTree);
//        int size = treeNodes.size();
//        if (size == 1) {
//            return treeNodes.get(0);
//        }
//        treeNodes.get(0).right = treeNodes.get(1);
//        for (int i = 1; i < size-1; i++) {
//            treeNodes.get(i).left = treeNodes.get(i-1);
//            treeNodes.get(i).right = treeNodes.get(i+1);
//        }
//        treeNodes.get(size-1).left = treeNodes.get(size-2);
//
//        return treeNodes.get(0);
//
//
//    }
//
//    /**
//     * 中序遍历
//     */
//    private ArrayList<TreeNode> inOrder(TreeNode root) {
//        if (root==null) {
//            return null;
//        }
//
//        inOrder(root.left);
//        list.add(root);
//        inOrder(root.right);
//
//        return list;
//
//    }
// =============================================================================


    //** 借助一个指针指向每次遍历到的节点，下一次中序遍历到的节点的前驱便是此指针指向的节点，而此节点的后序是此时遍历到的节点。**

    TreeNode lastNodeList = null;
    /**
     * @Author: ZwZ
     * @Description: 在中序遍历过程中对指针进行改变
     * @Param: [pRootOfTree]
     * @return: jianZhi.TreeNode
     * @Date: 2020/1/27-16:19
     */
    public TreeNode Convert1(TreeNode pRootOfTree) {
        inOrderConvert(pRootOfTree);
        //寻找链表头节点
        while (lastNodeList != null && lastNodeList.left != null)
            lastNodeList = lastNodeList.left;
        return lastNodeList;
    }
    /**
     * @Author: ZwZ
     * @Description: 中序遍历并改变指针
     * @Param: [root]
     * @return: void
     * @Date: 2020/1/27-16:22
     */
    public void inOrderConvert(TreeNode root) {
        if (root == null)
            return;
        if (root != null) {
            inOrderConvert(root.left);
            root.left = lastNodeList;
            if (lastNodeList != null)
                lastNodeList.right = root;
            lastNodeList = root;
            inOrderConvert(root.right);
        }
    }
}
