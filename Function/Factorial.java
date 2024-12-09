import java.util.Scanner;
public class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        for(int i=n;i>1;i--){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); 
        int num = sc.nextInt();
        int res = factorial(num);
        System.out.println("Factorial of "+num+" is "+res);
        sc.close();
    }
    
}
