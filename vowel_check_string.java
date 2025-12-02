import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String vov="aeiouAEIOU";
        int cout=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<vov.length();j++){
        
        if(str.charAt(i)==vov.charAt(j)){
            cout=1;
            break;
        }
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
