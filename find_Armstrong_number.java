import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber, remainder, result = 0;
        int count = 0;
        originalNumber = number;
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }
        tempNumber = number; 
        while (tempNumber != 0) {
            remainder = tempNumber % 10;
            result += Math.pow(remainder, count);
            tempNumber /= 10;
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
