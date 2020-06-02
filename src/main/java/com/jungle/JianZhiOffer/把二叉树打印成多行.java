package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class 把二叉树打印成多行 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        LinkedList<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot==null) {
            return res;
        }
        q.add(pRoot);
        while(!q.isEmpty()){
            // BFS里是每次只取一个，而我们这里先得到队列长度size，这个size就是这一层的节点个数
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left!=null) {
                    q.offer(node.left);
                }
                if (node.right!=null) {
                    q.offer(node.right);
                }
            }
            if(list.size()!=0){res.add(list);}
        }
        return res;
    }

}
