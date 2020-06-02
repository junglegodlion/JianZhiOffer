package com.jungle.JianZhiOffer;

import java.util.ArrayList;

public class 二叉树中和为某一值的路径 {

    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)return result;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            result.add(new ArrayList<Integer>(list));
        //因为在每一次的递归中，我们使用的是相同的result引用，所以其实左右子树递归得到的结果我们不需要关心，
        //可以简写为FindPath(root.left, target)；FindPath(root.right, target)；
        //但是为了大家能够看清楚递归的真相，此处我还是把递归的形式给大家展现了出来。
        ArrayList<ArrayList<Integer>> result1 = FindPath(root.left, target);
        ArrayList<ArrayList<Integer>> result2 = FindPath(root.right, target);
        // 若到达这一步就说明路径不对，需要讲之前添加的数拿出
        // 因为list是全局变量，所有从递归中出来一次，就要就要减一个数,这是个回溯过程
        list.remove(list.size()-1);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        System.out.println(new 二叉树中和为某一值的路径().FindPath(root,22));
    }
}
