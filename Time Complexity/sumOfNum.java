// O(1) time complexity
import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt();
        int res = n*(n+1)/2;
        System.out.println("Sum of the number: "+res);
        sc.close();    
    }
    
}
