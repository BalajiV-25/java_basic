import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next(); 
        String s2 = scanner.next();
        if (hasAnyCommonChar(s1, s2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static boolean hasAnyCommonChar(String s1, String s2) {
        boolean[] charPresent = new boolean[256]; 
        for (char c : s1.toCharArray()) {
            charPresent[c] = true;
        }

        for (char c : s2.toCharArray()) {
            if (charPresent[c]) {
                return true; 
            }
        }
        return false;
    }
}
