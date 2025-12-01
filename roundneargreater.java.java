import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double n=sc.nextDouble();
    double ceilNumDouble = Math.ceil(n);
    int ceilNumInt = (int) ceilNumDouble;
    System.out.println(ceilNumInt);
    }
}