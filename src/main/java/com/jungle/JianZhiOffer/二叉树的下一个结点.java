package com.jungle.JianZhiOffer;

import java.util.ArrayList;

public class 二叉树的下一个结点 {
    static ArrayList<TreeLinkNode> list = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        TreeLinkNode par = pNode;
        while(par.next != null){
            par = par.next;
        }
        InOrder(par);
        for(int i=0;i<list.size();i++){
            if(pNode == list.get(i)){
                return i == list.size()-1?null:list.get(i+1);
            }
        }
        return null;
    }
    void InOrder(TreeLinkNode pNode){
        if(pNode!=null){
            InOrder(pNode.left);
            list.add(pNode);
            InOrder(pNode.right);
        }
    }
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
