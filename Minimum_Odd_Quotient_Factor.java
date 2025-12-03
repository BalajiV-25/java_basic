import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int currentQuotient = N;
        while (currentQuotient % 2 == 0) {
            currentQuotient = currentQuotient / 2;
        }
        int minimumFactor = N / currentQuotient;
        System.out.println(minimumFactor);
    }
}
