public class half_pyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
