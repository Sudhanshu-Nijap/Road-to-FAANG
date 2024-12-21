public class Palindrome {
    public static int isPalindrome(String s){
        int end = s.length()-1;
        int start = 0;
        while (end>start) {
            char frontChar = s.charAt(start);
            char backChar = s.charAt(end);
            if (frontChar != backChar) {
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
    public static void main(String[] args) {
        String str = "maam";
        int res = isPalindrome(str);
        if (res==1){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }

    }
    
}
