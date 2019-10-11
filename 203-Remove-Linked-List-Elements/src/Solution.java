/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
//思路： 1，头特殊处理 2. 遍历，删除所有相同项 3. 返回header
class Solution {
    public ListNode removeElements (ListNode head, int val) {

        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        ListNode prev = head;
        while (prev != null && prev.next != null) { //while 一定要有递增，链表返回head
            ListNode delNode = prev.next;
            if (delNode.val == val) {
                prev.next = delNode.next;
                delNode = null;
            }else {
                prev = prev.next;
            }
        }
        return head;
    }
}












