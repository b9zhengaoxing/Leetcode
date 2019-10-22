public class ListNode {
    int val;
    ListNode next;

    public ListNode (int x) {
        val = x;
    }

    //构造函数不能有返回值!
    //Java里面this就是self
    //使用arr为参数，创建链表，以当前ListNode为头节点
    public ListNode (int[] arr) {

        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("ListNode arr failed");

        this.val = arr[0];

        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {

            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString () {

        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val);
            res.append("->");
            if (cur.next == null) {
                res.append("NUll");
            }
            cur = cur.next;
        }
        return res.toString();
    }
}