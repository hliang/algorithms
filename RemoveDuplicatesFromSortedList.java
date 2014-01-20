/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) { return head;} // empty list
        
        ListNode currNode = head;
        ListNode nextNode = head.next;
        while(nextNode != null) {        // until end of list is reached
            if(currNode.val == nextNode.val) {  // duplicate found
                currNode.next = nextNode.next;  // set current node's "next" pointing to next-next node, i.e. skip one node.
            } else {
                currNode = nextNode;  // not duplicate, then move pointer of current node to the next node.
            }
            nextNode = currNode.next;    // set pointer of next node
        }
        return head;
    }
}
