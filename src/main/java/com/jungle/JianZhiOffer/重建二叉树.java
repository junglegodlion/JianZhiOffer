package com.jungle.JianZhiOffer;


import java.util.Arrays;

/**
 * 已知前序遍历或后序遍历可以得到根节点，中序遍历在已知根节点的情况下可以得知左子树和右子树的遍历结果
 *
 */
public class 重建二叉树 {


    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {

        // 终止条件
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        // 根节点
        TreeNode root = new TreeNode(pre[0]);

        // 从中序遍历中找到根节点的位置
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                // 左子树，注意 copyOfRange 函数，左闭右开
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                // 右子树，注意 copyOfRange 函数，左闭右开
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                break;
            }
        }
        return root;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
