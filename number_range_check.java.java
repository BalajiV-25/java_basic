import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int L=sc.nextInt();
    int R=sc.nextInt();
    int cout=0;
    for(int i=L+1; i<R ;i++){
        if(N==i){
           
            cout=1;
            break;
        }
    }
    if(cout==1){
         System.out.print("yes");
    }
        else{
            System.out.print("no");
        }
    
    
  
    } 
}