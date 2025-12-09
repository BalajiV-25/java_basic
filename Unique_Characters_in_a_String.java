import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[256]; 
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        int Count = 0;
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                Count++;
            }
        }
        if (Count == 0)
            System.out.println(-1);
        else
            System.out.println(Count);
    }
}
