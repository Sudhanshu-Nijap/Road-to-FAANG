import java.util.Scanner;

public class findBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in bit: ");
        int bit = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;   // left shift the 1 (0001) by position
        // int bitmask = bit>>pos;    // right shift the bit (1011) by position
        System.out.println("Bit at postion "+pos+" is "+(bit & bitmask));   // do bit & bitmask
        // System.out.println("Bit at postion "+pos+" is "+(1 & bitmask));        // do 1 & bit

        // int bitmask = 1<<pos;   // left shift the 1 (0001) by position
        // int bitmask = bit>>pos;    // right shift the bit (1011) by position
        // System.out.println("Bit at postion "+pos+" is "+(bit & bitmask));   // do bit & bitmask
        System.out.println("Bit at postion "+pos+" is "+(1 & bitmask));        // do 1 & bit
        sc.close();
    }
    
}
