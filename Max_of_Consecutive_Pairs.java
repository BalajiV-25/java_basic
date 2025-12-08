import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N - 1; i++) {
            int max = Math.max(arr[i], arr[i + 1]);
            sb.append(max).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
/*(1, 1) → 1

(1, 3) → 3

(3, 0) → 3

(0, 5) → 5
Sample Input:
5
1 1 3 0 5


Sample Output:
1 3 3 5*/
