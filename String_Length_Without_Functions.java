import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
         
         int cout=0;
         for(char charArray : str.toCharArray()){
             cout++;
         }
        System.out.print(cout);
        
    }
}
