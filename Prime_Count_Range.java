import java.util.Scanner;
public class Main {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrimesInRange(int L, int R) {
        int count = 0;
        int start = Math.max(2, L);
        for (int num = start; num <= R; num++) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int primeCount; 
        if (L > R) {
            primeCount = 0;
        } else {
            primeCount = countPrimesInRange(L, R);
        }
        System.out.print(primeCount);
        scanner.close();
    }    
}
