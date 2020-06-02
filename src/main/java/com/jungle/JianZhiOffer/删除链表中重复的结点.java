package com.jungle.JianZhiOffer;

public class 删除链表中重复的结点 {
    public ListNode deleteDuplication(ListNode pHead)
    {

        if (pHead==null) {
            return pHead;
        }
        // 虚拟节点
        ListNode pre = new ListNode(0);
        pre.next = pHead;
        // 用来存储上一个可用节点
        ListNode sup=pre;
        ListNode dummy=pre;

        while (pre.next!=null) {
            // 现在节点的值与下一个相等，
            while (pre.next!=null&&pre.val==pre.next.val) {
                pre=pre.next;
            }

            ListNode cur = pre.next;
            if (cur==null) {
                break;
            }
            if (cur.next!=null) {
                if (cur.val!=cur.next.val) {
                    sup.next=cur;
                    sup=sup.next;
                    pre=cur;
                } else {
                    pre=cur;
                }
            } else {
                sup.next=cur;
                sup=sup.next;
                break;
            }


        }
        sup.next = null;

        return dummy.next;

    }
}
