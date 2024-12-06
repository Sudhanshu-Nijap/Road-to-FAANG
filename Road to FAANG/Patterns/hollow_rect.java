public class hollow_rect {
    public static void main(String[] args) {
        int r = 4;
        int c = 5;
        for (int row = 1; row <= r; row++) {
            for (int col = 1; col <= c; col++) {
                if (row == 1 || col == 1 || row == r || col == c) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}