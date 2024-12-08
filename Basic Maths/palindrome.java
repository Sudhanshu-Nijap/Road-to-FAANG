public class palindrome {
    public static boolean isPalindrome(int x){
        int org = x;
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rev*10+rem;
            x /= 10;
        }
        if(org == rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 121;
        if(isPalindrome(num)){
            System.out.println(num+" is a Palindrone number");
        }
        else{
            System.out.println(num+" is not a palindrome number");
        }
    }
}
