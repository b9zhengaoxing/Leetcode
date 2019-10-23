
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
//思路： 1，头特殊处理 2. 遍历，删除所有相同项 3. 返回header
public class SolutionPrint {
    public ListNode removeElements (ListNode head, int val, int depth) {

        String depth_string = generalString(depth);
        if (head == null) {
            System.out.println(depth_string + "Call：remove " + val + " in " + head);
            System.out.println(depth_string + "Return " + head);
            return head;
        }


        System.out.println(depth_string + "Call：remove " + val + " in " + head.toString());
        head.next = removeElements(head.next, val, depth + 1);
        if (head.val == val) {
            System.out.println(depth_string + "After remove " + val);
            System.out.println(depth_string + "Return " + head.toString());
            return head.next;
        } else {
            System.out.println(depth_string + "After remove " + val);
            System.out.println(depth_string + "Return " + head.toString());
            return head;
        }
    }

    /**
     * 深度打印--
     *
     * @param depth
     * @return
     */
    public String generalString (int depth) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            ret.append("--");
        }
        return ret.toString();
    }

    public static void main (String[] args) {

        // write your code here
        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        ListNode list = new ListNode(arr);
        System.out.println(list.toString());
        System.out.println();

        SolutionPrint solution = new SolutionPrint();
        solution.removeElements(list, 6, 0);
//        System.out.println(list.toString());
    }
}