import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter "+size+" elements: ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        for (int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}
