import java.util.Scanner;
public class ValidIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's a valid identifier: ");
        String identifier = sc.nextLine();
        
        if (isValidIdentifier(identifier)) {
            System.out.println(identifier + " is a valid Java identifier.");
        } else {
            System.out.println(identifier + " is NOT a valid Java identifier.");
        }
        
        sc.close();
    }
    
    public static boolean isValidIdentifier(String str) {
        // Check if empty or null
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        // Check if it is a keyword
        if (isKeyword(str)) {
            return false;
        }
        
        // Check first character
        char first = str.charAt(0);
        if (!Character.isLetter(first) && first != '_' && first != '$') {
            return false;
        }
        
        // Check rest of the characters
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_' && ch != '$') {
                return false;
            }
        }
        
        return true;
    }
    public static boolean isKeyword(String str) {
        String[] keywords = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
            "class", "const", "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new",
            "package", "private", "protected", "public", "return", "short", "static",
            "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while", "true", "false", "null"
        };
        for (String keyword : keywords) {
            if (str.equals(keyword)) {
                return true;
            }
        }
        return false;
    }
}
