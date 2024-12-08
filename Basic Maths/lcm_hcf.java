class lcm_hcf {  
    public static int[] lcmAndGcd(int a, int b) {

        int lcm = -1;
        int hcf = -1;
        for(int i = 1;i<Integer.max(a,b);i++){
            if (a%i==0 && b%i==0){
                hcf = i;
            }
        lcm = (a*b)/hcf;
        }
        return new int[] { lcm, hcf };
    }
    public static void main(String[] args){
        int[] r = new int[2];
        int a = 14;
        int b = 8;
        r = lcmAndGcd(a,b);
        System.out.print(r[0]+","+r[1]);
    }
}