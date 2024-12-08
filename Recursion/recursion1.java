public class recursion1 {
    public static void rec(int c) {
        if (c == 5) {
            return;
        }
        System.out.println(c + 1); 
        rec(c + 1); 
    }

    public static void main(String[] args) {
        rec(0); 
    }
}
