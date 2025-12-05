import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        // Input N, P, K
        int n = obj.nextInt(); 
        int p = obj.nextInt(); 
        int k = obj.nextInt(); 
        char[] digits = String.valueOf(n).toCharArray();
        int ans=p+k;
        if(digits.length>=ans){
            System.out.print(digits[ans-1]);
        }
    }
}
