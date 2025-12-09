import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[256];  
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        int maxFreq = 0;
        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }
        if (maxFreq <= 1) {
            System.out.println(0);
        } else {
            System.out.println(maxFreq);
        }
    }
}
