public class EulideanAlgo {
    public static int algo(int a ,int b){
        if (a>0 && b>0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a==0){
            return b; 
        }
        return a;
    }
    public static void main(String[] args) {
        int num1 = 52;
        int num2 = 10;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + algo(num1, num2));
    }
    
}
