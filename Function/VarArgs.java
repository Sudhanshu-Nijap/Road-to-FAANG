import java.util.Arrays;

public class VarArgs {
    public static void MultipleArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {
        MultipleArgs(10,20,30,40);
    }
}
