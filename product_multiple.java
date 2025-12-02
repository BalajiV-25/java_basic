import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int rev=1;
        while(num!=0){
            int dig=num%10;
            rev*=dig;
            
            num/=10;
        }
        System.out.print(rev);
    }
}
