public class Max {
    public static int maxArray(int[] arr, int start, int end) {
        int max = arr[0];
        if (start > end) {
            return -1;
        }
        if (start == end) {
            return arr[start];
        }
        for (int i = start; i <= end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 3, 7, 9, 45 };
        int res = maxArray(arr, 1, 5);
        System.out.println(res);
    }

}
