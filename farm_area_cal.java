import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      float num1=sc.nextFloat();
      float num2=sc.nextFloat();
      float num3=num1*num2;
      System.out.printf("%.5f",num3);
    }
}
