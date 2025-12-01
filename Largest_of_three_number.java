import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int N3=sc.nextInt();
        if(N1>N2||N1>N3){
            System.out.print(N1);
        }
        else if(N2>N1||N2>N3){
            System.out.print(N2);
        }
        else{
            System.out.print(N3);
        }
        
    }
}
