public class Main {

    public static void main(String[] args) {

        // write your code here
        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        ListNode list = new ListNode(arr);
        System.out.println(list.toString());

        Solution solution = new Solution();
        solution.removeElements(list,6);
        System.out.println(list.toString());
    }
}
