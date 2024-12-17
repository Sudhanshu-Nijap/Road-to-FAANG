import java.util.Scanner;
public class Array1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        System.out.print("Enter inputs: ");
        for (int i = 0; i < 3; i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("You entered: ");
        for (int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }    
}
