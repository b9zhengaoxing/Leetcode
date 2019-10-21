public class Sum {
    //对外接口
    public static int sum (int arr[]) {
        return sum(arr, 0);
    }

    //计算 arr[l....n)这个区间内所有数字的和，递归函数
    private static int sum (int arr[], int l) {
        if (arr == null) {
            throw new IllegalArgumentException("sum failed,arr is null !");
        }

        if (l > arr.length || l < 0) {
            throw new IllegalArgumentException("sum failed, l is" + l);
        }

        if (l == arr.length) {
            return 0;
        } else {
            return arr[l] + sum(arr,
                    l + 1);
        }
    }

    public static void main (String[] args) {

        // write your code here
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(arr));
    }
}
