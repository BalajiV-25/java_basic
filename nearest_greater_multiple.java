import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N= obj.nextInt();
        int res= N/10;
        res++;
        int fina = res*10;
        System.out.print(fina);
    }
}
