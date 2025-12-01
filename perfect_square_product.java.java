import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int pro= num1*num2;
        long root=(long)Math.sqrt(pro);
        if(root*root==pro){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
