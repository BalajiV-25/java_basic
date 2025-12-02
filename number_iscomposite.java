import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        scanner.close();

        boolean isPrime = true;

        
        if (num <= 1) {
            isPrime = false;
        } else {
            
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
