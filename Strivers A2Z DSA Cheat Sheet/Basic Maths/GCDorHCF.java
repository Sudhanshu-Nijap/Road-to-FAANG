public class GCDorHCF {
    public  static int hcf(int n1,int n2){
        int hcf = -1;
        if(n1==1 || n2 == 1){
            return 1;
        }
        for(int i = 1;i<=Integer.max(n1, n2);i++){
            if (n1%i==0 && n2%i==0){
                hcf = i;
            }
        }
        return hcf;
    }
    
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        System.out.println(hcf(num1, num2));
    }
    
}
