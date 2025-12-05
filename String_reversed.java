import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        
        StringBuilder reversed=new StringBuilder(userInput).reverse();
        System.out.print(reversed);
    }
}
