import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int digit=0;
         int ans=0;
         while(n!=0){
             digit=n%10;
             ans+=Math.pow(digit,2);
             n/=10;
         }
        System.out.print(ans);
    }
}
