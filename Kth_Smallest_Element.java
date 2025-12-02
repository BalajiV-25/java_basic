import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int [] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findKthSmallest(arr, K);
        System.out.println(result);
    }

    public static int findKthSmallest(int[] arr, int K) {
        if (K <= 0) {
            return -1;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int count = 1; 
        int lastFound = arr[0];
        if (K == 1) return arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != lastFound) {
                count++;
                lastFound = arr[i];
                if (count == K) {
                    return arr[i];
                }
            }
        }

        return -1;
    }
}
