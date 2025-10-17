import java.util.Arrays;
public class AnagramCheck {
 public static void main(String[] args) {
 String str1 = “listen”;
 String str2 = “silent”;
 boolean isAnagram = checkAnagram(str1, str2);
 if (isAnagram) {
 System.out.println(str1 + ” and ” + str2 + ” are anagrams.”);
 } else {
 System.out.println(str1 + ” and ” + str2 + ” are not anagrams.”);
 }
 }
 public static boolean checkAnagram(String str1, String str2) {
 if (str1.length() != str2.length()) {
 return false;
 }
 char[] chars1 = str1.toCharArray();
 char[] chars2 = str2.toCharArray();
 Arrays.sort(chars1);
 Arrays.sort(chars2);
 return Arrays.equals(chars1, chars2);
 }
}
