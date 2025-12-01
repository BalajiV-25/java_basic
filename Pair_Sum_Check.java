import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int cout=0;
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=obj.nextInt();
        }
         for(int i=0;i<a;i++){
        if(arr[0]+arr[i]==b){
            cout++;
        }
         }
         if(cout!=0){
        System.out.print("yes");
        }
        else{
           System.out.print("no"); 
        }
    }
}
