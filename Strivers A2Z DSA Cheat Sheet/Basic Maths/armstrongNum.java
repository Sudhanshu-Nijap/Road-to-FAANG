public class armstrongNum {
    public static boolean isArmstrong(int n) {
        int org = n;
        double sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = Math.pow(rem, 3) + sum;
            n /= 10;
        }
        if (sum == org) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // int num = 371;
        int num = 35;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        }
        else {
            System.out.println(num+" is not an Armstrong number");
        }
    }

}
