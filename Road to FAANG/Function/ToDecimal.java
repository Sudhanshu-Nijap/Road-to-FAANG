import java.util.Scanner;
public class ToDecimal {
    public static int toDecimal(int num){
        int ans = 0;
        int pow = 1;
        while (num>0){
            int rem = num%10;
            ans += rem*pow; 
            num = num/10;
            pow = 2*pow;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter in binary: ");
        int n = sc.nextInt();
        System.out.println(n+" to "+toDecimal(n));
        sc.close();
    }

}