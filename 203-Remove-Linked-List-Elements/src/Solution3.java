/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
//思路： 1，头特殊处理 2. 遍历，删除所有相同项 3. 返回header
public class Solution3 {
    public ListNode removeElements (ListNode head, int val) {

        if (head == null) {
            return head;
        } else if (head.next == null) {
            if (head.val == val) {
                return null;
            } else {
                return head;
            }
        } else if (head.next != null) {
            if (head.val == val) {
                head = this.removeElements(head.next, val);
            } else {
                head.next = this.removeElements(head.next, val);
            }
        }

        return head;
    }

    public static void main (String[] args) {

        // write your code here
        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        ListNode list = new ListNode(arr);
        System.out.println(list.toString());

        Solution3 solution = new Solution3();
        solution.removeElements(list, 6);
        System.out.println(list.toString());
    }
}







