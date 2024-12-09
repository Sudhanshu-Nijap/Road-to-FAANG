public class Scoope {
    public static void main(String[] args) {
        int a = 10; // use within the main block (global)
        {
            int c = 30; // use within this block (local)
            System.out.println(a); // 10
            a = 20;                // update
            System.out.println(a); // 20
            System.out.println(c); 
        }
        System.out.println(a);    // 20
    }
}
