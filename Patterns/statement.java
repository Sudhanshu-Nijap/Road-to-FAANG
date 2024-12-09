import java.util.Scanner;
public class statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        System.out.println("Enter three inputs: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println(a+" is greater");
        }
        else if (b>a && b>c){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+" is greater");
        }
        sc.close();
    }
    
}
