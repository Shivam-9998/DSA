/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
     if (head == null || left == right) return head;

        int count = 1;
        ListNode temp = head;

        ListNode beforeLeft = null;

        while (count < left) {
            beforeLeft = temp;
            temp = temp.next;
            count++;
        }

        ListNode start = temp;
        ListNode prev = null;

        while (count <= right) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
            count++;
        }

        start.next = temp;

        if (beforeLeft != null) {
            beforeLeft.next = prev;
        } else {
            head = prev;
        }

        return head;
    }
}