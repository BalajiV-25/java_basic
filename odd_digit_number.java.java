import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
     
        String numStr = String.valueOf(N);
        StringBuilder oddDigits = new StringBuilder();
        boolean foundOdd = false;

        for (int i = 0; i < numStr.length(); i++) {
            
            int digit = Character.getNumericValue(numStr.charAt(i));
            
            
            if (digit % 2 != 0) {
                oddDigits.append(digit).append(" ");
                foundOdd = true;
            }
        }

        if (foundOdd) {
            
            System.out.println(oddDigits.toString().trim());
        } else {
            
            System.out.println("-1");
        }
    }
}

    
