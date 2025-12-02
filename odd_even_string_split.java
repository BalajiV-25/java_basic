import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        String[] digits = String.valueOf(str1).split("");
        for(int i=0;i<digits.length;i++){
            if(i%2==0){
                System.out.print(digits[i]+"");
            }
            
        }
        System.out.print(" ");
        for(int i=0;i<digits.length;i++){
            if(i%2!=0){
                System.out.print(digits[i]+"");
            }
            
        }
    }
}
