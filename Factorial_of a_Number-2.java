import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int dig=1;
        if(a>0){
        for(int i=a;i>0;i--){
            dig*=i;
        }
        }
        System.out.println(dig);
    }
}
