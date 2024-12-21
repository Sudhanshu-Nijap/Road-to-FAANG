public class reverseNumber {
    public static int reverseNum(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 12345;
        int reversed = reverseNum(num);
        System.out.println(reversed);
    }

}
