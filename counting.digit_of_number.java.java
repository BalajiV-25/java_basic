import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cout=0;
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
            cout++;
            
        }
        System.out.print(cout);
    }
}