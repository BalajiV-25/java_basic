import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int num1= obj.nextInt();
        int num2= obj.nextInt();
        int num3= obj.nextInt();
        int ans=(num1*num2)%num3;
        System.out.println(ans);
    }
}
