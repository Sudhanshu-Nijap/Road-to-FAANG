import java.util.Scanner;

public class ToBinary {
    public static int toBinary(int num) {
        int ans = 0;
        int pow = 1;
        while (num>0){
            int rem = num%2;
            ans += rem*pow;
            num = num/2;
            pow = pow*10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter in decimal: ");
        int n = sc.nextInt();
        System.out.println(n+" to "+toBinary(n));
        sc.close();
    }
    
}
