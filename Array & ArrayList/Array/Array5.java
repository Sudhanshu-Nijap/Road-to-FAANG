import java.util.Scanner;
public class Array5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter num to find: ");
        int n = sc.nextInt();
        System.out.println("Output");
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                if(arr[i][j] == n){
                System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
        sc.close();

    }

}