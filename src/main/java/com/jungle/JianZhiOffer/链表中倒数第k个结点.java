package com.jungle.JianZhiOffer;

import java.util.Stack;

public class 链表中倒数第k个结点 {

//    public ListNode FindKthToTail(ListNode head,int k) {
//
//
//        int count = 0;
//        Stack<ListNode> stack = new Stack<>();
//
//        ListNode temp = new ListNode(0);
//
//        temp.next = head;
//
//        while (temp.next != null) {
//            count++;
//            temp = temp.next;
//            stack.push(temp);
//
//        }
//
//        ListNode node = new ListNode(0);
//        if (stack.size() < k) {
//            return null;
//        }
//
//        for (int i = 0; i < k; i++) {
//            node = stack.pop();
//        }
//
//        return node;
//
//    }



public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p, q;
        p = q = head;
        int i = 0;
        for (; p != null; i++) {
            if (i >= k)
                q = q.next;
            p = p.next;
        }
        return i < k ? null : q;
    }

}
