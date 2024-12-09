public class loop {
    public static void main(String[] args) {
        int n = 10 ;
        int a = 0;
        int b = 1;
        int c = 0;
        while (n>0) {
            System.out.println(c);
            c = a+b;
            a = b;
            b = c;
            n--;
        }
    }
}
