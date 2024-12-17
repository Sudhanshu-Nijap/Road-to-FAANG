import java.util.Scanner;
public class function1 {
    public static void printName(String name){  // function declare 
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        printName(name); // function call
        sc.close();
    }
}
