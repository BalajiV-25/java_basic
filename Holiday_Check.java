import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
   
        String day = obj.next();
        if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
            System.out.println("yes");
        } else {
            System.out.println("no"); 
        }
    }
}
