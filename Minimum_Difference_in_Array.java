import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        int minDiff = Math.abs(arr[0] - arr[1]);
        for (int i = 1; i < n - 1; i++) {
            int currentDiff = Math.abs(arr[i] - arr[i+1]);
            minDiff = Math.min(minDiff, currentDiff);
        }
        System.out.println(minDiff);
        
    }
}
