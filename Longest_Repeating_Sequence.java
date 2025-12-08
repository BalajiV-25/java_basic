import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("-1");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        int maxLength = 0;
        int currentLength = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        if (maxLength <= 1) {
            System.out.println("-1");
        } else {
            System.out.println(maxLength);
        }
    }
}
