public class primeNum {
    public static int isPrime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if (n%i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 12;
        if(isPrime(num)==2){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }    
}
