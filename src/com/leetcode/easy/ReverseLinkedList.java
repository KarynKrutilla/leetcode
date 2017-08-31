package com.leetcode.easy;

import com.leetcode.common.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        // base cases
        if(head == null || head.next == null) {
            return head;
        }

        // init
        ListNode previous = null;
        ListNode current = head;
        ListNode next; // this will get set in the loop

        // loop over the list
        while(current != null) { // keep going until we reach the end of the list
            next = current.next; // increment next
            current.next = previous; // set next to previous (this actually does the reverse)
            previous = current; // increment previous and current
            current = next;
        }
        return previous; // return previous node - this is the last non-null node (now the first)

    }
}
