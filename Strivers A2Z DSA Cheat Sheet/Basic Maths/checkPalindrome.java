public class checkPalindrome {
    public static boolean checkPalindromeNum(int n) {
        int org = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        if (org == rev){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 1221;
        boolean res = checkPalindromeNum(num);
        System.out.println(res);
    }

}
