import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=n1-n2;
        if(n3%2==0){
            System.out.print("even");
            
        }
        else
        {
            System.out.print("odd");
        }
    }
}
