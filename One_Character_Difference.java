import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.next();
        String str2 = obj.next();
        if (str1.length() != str2.length()) {
            System.out.print("no");
            return;
        }

        int diffCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diffCount++;
            }
        }
        
        if (diffCount == 1) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
