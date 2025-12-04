import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int res=n>>m;
        System.out.println(res);
    }
}
