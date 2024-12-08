public class prime {
    public static boolean isPrime(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i != 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 12;
        if(isPrime(num)){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
    
}
