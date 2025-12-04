import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int dig=1;
        for(int i=0;i<m;i++){
            dig*=n-i;
        }
        System.out.println(dig);
    }
}
