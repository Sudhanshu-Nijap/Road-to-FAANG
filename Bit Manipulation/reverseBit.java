<<<<<<< HEAD
import java.util.Scanner;

public class reverseBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in bit: ");
        int bit = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        System.out.print("Enter 1 or 0:");
        int choice = sc.nextInt();
        switch(choice){
            case 0:{
                System.out.print("set to: "+(bit | bitmask));
                break;
            }
            case 1:{
                bitmask = ~(1<<pos);
                System.out.print("set to: "+(bit & bitmask));
                break;
            }
        }
        sc.close();
    }
=======
public class reverseBit {
    
>>>>>>> 07fd2bc (Initial commit)
}
