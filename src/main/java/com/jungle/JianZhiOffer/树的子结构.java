package com.jungle.JianZhiOffer;

/**
 * 1.先写一个方法，传入两棵根节点值相同的树，判断tree1是否和tree2结构一样
 * 2.再写一个方法来遍历大树，找到一个和小树根节点值相等的节点，以该节点和小树根节点的值为参数调用上面的方法即可
 *
 */
public class 树的子结构 {

    public  boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if ( root2 == null || root1 == null){
            return false;
        }
        return doesTree1HasTree2(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }



    private boolean doesTree1HasTree2(TreeNode tree1, TreeNode tree2){
        if ( tree2 == null ){
            return true;
        }
        if ( tree1 == null ){
            return false;
        }

        if ( tree1.val != tree2.val ){
            return false;
        }
        return doesTree1HasTree2(tree1.left, tree2.left) && doesTree1HasTree2(tree1.right, tree2.right);
    }
}
