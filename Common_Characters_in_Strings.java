import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        hasCommonChar(s1, s2);
    }
    public static void hasCommonChar(String s1, String s2) {
        boolean[] charPresent = new boolean[256];
        for (char c : s1.toCharArray()) {
            try {
                charPresent[c] = true;
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        for (char c : s2.toCharArray()) {
            try {
                if (charPresent[c]) {
                    System.out.println("yes");
                    return; 
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        System.out.println("no");
    }
}
