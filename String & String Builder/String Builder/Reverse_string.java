public class Reverse_string {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        for (int i = 0; i < str.length()/2; i++) {
            int front = i;
            int back = str.length() - 1 - i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);
            // Swap characters at front and back indices
            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);

    }

}
