import java.util.Scanner;
public class switch_case{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        int button = sc.nextInt();

        switch(button){
            case 1:{
                System.out.println("namaste");
                System.out.println("You have selected 1");
                break;
            }
            case 2:{
                System.out.println("hello");
                System.out.println("You have selected 2");
                break;
            }
            default:{
                System.out.println("Invalid choice");
            }
        }
        
        sc.close();
    }
}