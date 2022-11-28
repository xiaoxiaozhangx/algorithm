package org.example.leetcode;

public class ListNodeMerge {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1 虚假的头节点
        ListNode dump = new ListNode(0);
        ListNode p = dump;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                p.next = list2;
                list2 = list2.next;
            } else {
                p.next = list1;
                list1 = list1.next;
            }
            p = p.next;
        }
        if (list1 != null) {
            p.next = list1;

        }
        if (list2 != null) {
            p.next = list2;
        }
        return dump.next;

    }
}
