public class Convert_int_str {
    public static void main(String[] args) {
        // To convert to Integer - Integer.parseInt(str);
        String str = "10";
        int num = Integer.parseInt(str);
        System.out.println(num+20);

        // To convert to String - Integer.toString(num)
        int n = 10;
        String s = Integer.toString(n);
        System.out.println(s+"abc");
    } 
}
