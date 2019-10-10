/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements (ListNode head, int val) {

        //index 为0时候 递归
        while (head != null && head.val == val) {
            if (head.next == null) {
                return null;
            } else {
                head = head.next;
            }
        }

        while (head.next != null) {
            ListNode delNode = head.next;
            if (delNode.val == val) {
                head.next = delNode.next;
            }
        }
        return head;
    }
}











