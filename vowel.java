import java.io.*;
public class Vowel {
    public static void main(String args[]) {
        char ch = 'b';
        
        // check using if else
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u') {
            System.out.println(ch+" is a vowel");
        }else {
            System.out.println(ch+" is a consonant");
      }
    }
}
