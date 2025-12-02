import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE; 

        for (int i = 0; i < 10; i++) {
           
            int currentNumber = scanner.nextInt();

            if (currentNumber < minimum) {
                minimum = currentNumber; // Update minimum if a smaller number is found
            }
        }

        System.out.println(minimum);
        
    }
}
