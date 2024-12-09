public class Arr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        float[] arr2 = { 1, 4, 5 };
        // int[][] arr = new int[2][];  // compulsory size for rows not for cols
        String[] arr3 = { "abc", "efg", "hij" };
        for (int i = 0; i < 3; i++) {
            System.out.print(arr1[i]);
            System.out.print(arr2[i]);
            System.out.print(arr3[i]);
            System.out.println();
        }
    }
}
