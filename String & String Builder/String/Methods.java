public class Methods {
    public static void main(String[] args) {
        String a = "Sudhu";
        String b = "nshu";
        String full = a + b;

        // concatenation - s1+s2
        System.out.println(full);

        // str.length()
        System.out.println(full.length());

        // toLowerCase()
        System.out.println(a.toLowerCase());

        // toUpperCase()
        System.out.println(a.toUpperCase());

        // charAt(index)
        System.out.println(full.charAt(2));
        for (int i = 0; i < full.length(); i++) {
            System.out.println(full.charAt(i));
        }

        // s1.compareTo(s2)
        // 1. s1>s2 : +ve value
        // 2. s1==s2 : 0
        // 3. s1<s2 : -ve value

        // hello wello --> h<w by ASCII
        if (a.compareTo(b) == 0) {
            System.out.println("Strings are equal");
        } else { 
            System.out.println("Strings are not equal");
        }

        // using ==
        if (new String("Tony") == new String("Tony")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // str.substring(beg index, end index)
        System.out.println(full.substring(2, 5));

        // str.trim()
        String t = "       Sudhu      ";
        System.out.println(t.trim());

        // str.replace(old,new)
        System.out.println(a.replace('S', 'H'));
        System.out.println(a.replace("ud", "W"));

        // str.startsWith("abc")
        System.out.println(a.startsWith("Su")); // true

        // str.endsWith("abc")
        System.out.println(a.endsWith("lu")); // false

        // str.indexOf(char,fromIndex)  - starts from starting

        // System.out.println(a.indexOf('u',6)); // -1  // S u d h u
                                                        // 0 1 2 3 4
        System.out.println(a.indexOf('u', 3)); // 4    // S u d h u
                                                                    // 0 1 2 3 4

        // str.lastIndexOf(char,fromIndex)  - starts from ending
        System.out.println(a.lastIndexOf('u', 3)); // 1    // S u d h u
                                                                         // 0 1 2 3 4

        // str.equals(string)
        System.out.println(a.equals("Sudhu"));
        System.out.println("Sudhu".equals(a));

        // str.equalsIgnoreCase(string) - ignores cases
        System.out.println(a.equalsIgnoreCase("suDHu"));

        // Escape Sequence ( \ )
        System.out.println("Escape Sequence: \" \\ ");
    }
}

