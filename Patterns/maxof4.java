import java.util.Scanner;
class maxof4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 4 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int max = (a>b && a>c && a>d) ? a:
        (b>a && b>c && b>d) ? b:
        (c>a && c>b && c>d) ? c: d;
        
        System.out.println("The maximum of 4 numbers is: "+max);
        sc.close();
    }
}