public class StringBuilder_Methods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sudhanshu");
        System.out.println(sb);
        // charAt(index)
        System.out.println(sb.charAt(5));

        // setCharAt(index,char); - to modify the character at the specified index
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert(index,char) - to insert the character at the specified index
        System.out.println(sb.insert(1,'W'));
        // delete(start index, end index); - to delete the characters at specified index range
        System.out.println(sb.delete(2, 5));
        sb.delete(0,2);
        System.out.println(sb.insert(0,"Sud"));
        // append(char) - to append the character at the end of the string
        sb.append('H');
        sb.append("ello");
        System.out.println(sb);

        // length()
        System.out.println(sb.length());

        // deleteCharAt(index)
        System.out.println(sb.deleteCharAt(5));
    }
    
}
