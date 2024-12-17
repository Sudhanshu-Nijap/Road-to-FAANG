import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements: ");
        for (int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter an element to find: ");
        int ele = sc.nextInt();
        for (int i = 0;i<5;i++){
            if (arr[i] == ele){
                System.out.println("Element found at index " + i);
            }
        }
        sc.close();
    }
}
