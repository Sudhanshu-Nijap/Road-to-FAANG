public class reverse_num {
    public static int reverse(int x) {
        long rev= 0;
        while( x != 0){
            int rem = x % 10;
            rev = (rev*10) + rem;
            x = x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }
    public static void main(String[] args) {
        int num = -1234;
        System.out.println("Reversed num: "+reverse(num));
    }
}