import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("-1");
            return;
        }
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (map1[c1] != map2[c2]) {
                if (map1[c1] != 0 || map2[c2] != 0) {
                    System.out.println("no");
                    return;
                }
            }
            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }
        System.out.println("yes");
    }
}
