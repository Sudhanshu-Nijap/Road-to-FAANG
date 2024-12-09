import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in bit: ");
        int bit = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        int bitmask = ~(1<<pos);  // not the bitmask (0001) -> (1110) and shift as per the pos
        System.out.println("Bit at "+pos+" is clear "+(bitmask & bit));
        sc.close();
    
    }    
}
