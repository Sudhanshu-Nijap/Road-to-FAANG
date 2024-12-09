// To set 1 at given position
import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in bit: ");
        int bit = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        System.out.println("Bit at "+pos+" is set to "+(bitmask | bit));
        sc.close();
    }
}
