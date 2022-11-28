package org.example.leetcode;

public class ListNodePation {
    private ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode p = head,p1=dummy1,p2=dummy2;
        while (p != null) {
            if (p.val < x) {
                p1.next = p;
                p1=p1.next;
            } else {
                p2.next = p;
                p2=p2.next;
            }
            // 断开链表中的next 指针
            ListNode temp = p.next;// 保存链表的next
            p.next = null;// 断开
            p = temp; // 把next 赋值给p

        }
        p1.next=dummy2.next;
        return dummy1.next;


    }
}
