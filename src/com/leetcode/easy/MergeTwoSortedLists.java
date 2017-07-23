package com.leetcode.easy;

import com.leetcode.common.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/#/description
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // If either list is null, return the other
        if(l1 == null) {
            return l2;
        }
        else if(l2 == null) {
            return l1;
        }

        // Otherwise, progress the lower node to its next and merge with the other list
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else { // l2.val < l1.val
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

