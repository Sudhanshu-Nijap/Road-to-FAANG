public class CountNumbers {
    public static int countNums(int n){
        int count = 0;
        while (n>0){
            int rem = n%10;
            count ++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 7789;
        System.out.println(countNums(num));
        
    }
    
}
