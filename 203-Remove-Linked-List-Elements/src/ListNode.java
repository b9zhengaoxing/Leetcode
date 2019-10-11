public class ListNode {
    int val;
    ListNode next;

    public ListNode (int x) {
        val = x;
    }

    //构造函数不能有返回值，Java里面this就是self
    public ListNode (int[] arr) {

        ListNode prev = this;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                this.val = arr[0];
            } else {
                prev.next = new ListNode(arr[i]);
                prev = prev.next;
            }
        }
    }

    @Override
    public String toString () {

        StringBuilder res = new StringBuilder();
        ListNode head = this;
        while (head != null) {
            res.append(head.val);
            if (head.next != null) {
                res.append("->");
            }
            head = head.next;
        }
        return res.toString();
    }
}