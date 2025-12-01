import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int B=sc.nextInt();
        int H=sc.nextInt();
        int area=L*B*H;
        int volume=2*(L*B+B*H+H*L);
        System.out.print(volume+" "+area);
        // System.out.print(" ");
        // System.out.print(area);
    }
}