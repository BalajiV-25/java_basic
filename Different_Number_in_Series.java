import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        int evenCount = 0;
        int oddCount = 0;
        int lastEvenIndex = -1;
        int lastOddIndex = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
                lastEvenIndex = i;
            } else {
                oddCount++;
                lastOddIndex = i;
            }
        }
        

        if (evenCount == 1) {
            System.out.println(arr[lastEvenIndex]);
        } else if (oddCount == 1) {
            System.out.println(arr[lastOddIndex]);
        } else {
            System.out.println("-1");
        }
    }
}
