package com.jungle.JianZhiOffer;

public class 反转链表 {
    public ListNode ReverseList(ListNode head) {

        if (head==null || head.next == null) {
            return head;
        }


        ListNode node = ReverseList(head.next);
        head.next.next = head;
        head.next =null;
        return node;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
