import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if((N % 7==0)){ 
            System.out.println("yes");
            
        }
        else{
            System.out.println("no");
        }
    }
}
