public class second_min_max_value {
    public static int secondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                second_min = min;
                min = arr[i];
            }
            else if(arr[i] != min && arr[i] < second_min) {
                second_min = arr[i];
            }   
        }
        return second_min;
    }
    public static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] != max && arr[i] > second_max) {
                second_max = arr[i];
            }
        }
        return second_max;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 12, 67, 4, 89, 2, 78 };
        System.out.println("Second maximum Value: "+secondMax(arr));
        System.out.println("Second minimum Value: "+secondMin(arr));
    }

}
