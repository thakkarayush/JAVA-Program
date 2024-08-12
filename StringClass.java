package classes;

public class StringClass {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";

        // charAt
        char ch = str.charAt(6);
        System.out.println("Character at index 6: " + ch);

        // getChars
        char[] dstChars = new char[5];
        str.getChars(7, 12, dstChars, 0);
        System.out.println("Extracted characters: " + new String(dstChars));

        // getBytes
        byte[] dstBytes = new byte[5];
        str.getBytes(7, 12, dstBytes, 0);
        System.out.println("Extracted bytes: " + new String(dstBytes));

        // equalsIgnoreCase
        String str1 = "hello";
        String str2 = "HELLO";
        boolean isEqual = str1.equalsIgnoreCase(str2);
        System.out.println("Strings are equal ignoring case: " + isEqual);

        // substring
        String substr = str.substring(7);
        System.out.println("Substring from index 7: " + substr);

        // concat
        String concatStr = str1.concat(", ").concat(str2).concat("!");
        System.out.println("Concatenated string: " + concatStr);

        // replace
        String replacedStr = str.replace('l', 'p');
        System.out.println("Replaced string: " + replacedStr);

        // split
        String[] parts = str.split(",", 2);
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        // toLowerCase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerStr);

        // toUpperCase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);

        // trim
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // toCharArray
        char[] charArray = str.toCharArray();
        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.println(c);
        }

        // valueOf
        char c = 'A';
        String valueOfStr = String.valueOf(c);
        System.out.println("String value of char: " + valueOfStr);
    }
}

