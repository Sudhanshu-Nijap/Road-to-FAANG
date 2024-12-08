public class count_divide {   
    public static int evenlyDivides(int n) {     
        int org_num = n;
        int c = 0;     
        while(n>0){
            int rem = n%10;
            if(rem!=0 && org_num%rem == 0){
                c++;
            }
            n /= 10;
        }
        return c;
    }
    public static void main(String[] args){
        int num = 42;
        System.out.println("Counter: "+evenlyDivides(num));
    }
}
    

