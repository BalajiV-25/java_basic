import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int rot = K % N;
        for (int i = 0; i < N; i++) {
            int originalIndex = (N - rot + i) % N;
            System.out.print(arr[originalIndex]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
