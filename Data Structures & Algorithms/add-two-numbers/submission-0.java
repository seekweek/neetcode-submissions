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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);  // Dummy node to build the result list
        ListNode current = dummy;
        int carry = 0;

        // Loop until both lists and carry are done
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;  // Update carry for next digit

            current.next = new ListNode(sum % 10);  // Store current digit
            current = current.next;

            if (l1 != null) l1 = l1.next;  // Move l1 forward
            if (l2 != null) l2 = l2.next;  // Move l2 forward
        }

        return dummy.next;
    }
}
