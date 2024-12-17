import java.util.Scanner;

public class function2 {

    public static int sumOfDigits(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = sumOfDigits(num1, num2);
        System.out.println("Sum Of Digits :"+sum);
        sc.close();
    }
}
