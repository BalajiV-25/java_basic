import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
         n1 = ( n1 > 0) ? n1 : -n1;
         n2 = ( n2 > 0) ? n2 : -n2;
  if(n1!=0&&n2!=0){
    while(n1 != n2) {
        
      if(n1 > n2) {
        n1 -= n2;
      }
      
      else {
        n2 -= n1;
      }
    }
    
    System.out.println(n2);
  }
  else{
       System.out.println("-1");
  }
    }
}
