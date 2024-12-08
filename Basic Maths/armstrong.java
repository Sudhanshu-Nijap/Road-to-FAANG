public class armstrong {
    public static boolean isArmstrong(int n){
        int org = n;
        double sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + Math.pow(rem,3);
            n /= 10;            
        }
        if(org == sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 153;
        if(isArmstrong(num)){
            System.out.println(num+" is a Armstrong number");
        }
        else{
            System.out.println(num+" is not a Armstrong number");
        }
    }
    
}
