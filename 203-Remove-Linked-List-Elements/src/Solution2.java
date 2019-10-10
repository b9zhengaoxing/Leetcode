/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
//思路： 1.虚拟头节点，不要特殊处理 2. 遍历，删除所有相同项 3. 返回header
class Solution2 {
    public ListNode removeElements (ListNode head, int val) {

        //虚拟头节点
        ListNode dumyHead = new ListNode(0);
        dumyHead.next = head;

        ListNode prev = dumyHead;
        while (prev.next != null) { //while 一定要有递增，链表返回head
            ListNode delNode = prev.next;
            if (delNode.val == val) {
                prev.next = delNode.next;
                delNode = null;
            }else {
                prev = prev.next;
            }
        }
        return dumyHead.next;
    }
}
