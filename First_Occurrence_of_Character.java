import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String charInput = sc.next();
        if (charInput.isEmpty()) {
            System.out.print("-1");
            return;
        }
        char ch = charInput.charAt(0);
        if (Character.isDigit(ch)) {
       
            System.out.print("-1");
            return; 
        }
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
           
                System.out.print((i + 1)); 
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.print("-1");
        }
    }  
}
