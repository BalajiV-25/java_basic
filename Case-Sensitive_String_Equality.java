import java.util.Scanner;
public class Main {
    public static boolean areStringsEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.next();
        String str2 = obj.next();
        if (areStringsEqual(str1, str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
