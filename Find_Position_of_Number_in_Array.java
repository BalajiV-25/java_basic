import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int[] arr = new int[n];
        boolean found = false; 
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                System.out.print(i + 1);
                found = true; 
            }
        }
        if (!found) {
            System.out.print("-1");
        }
        
    }
}
