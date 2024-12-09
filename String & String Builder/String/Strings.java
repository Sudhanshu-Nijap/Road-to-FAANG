import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Sudhanshu";
        System.out.print("Enter your fullname: ");
        String fullname = sc.nextLine();
        System.out.println(name);
        System.out.println("My fullname is: "+fullname);
        sc.close();
    }
    
}
