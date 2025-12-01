import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int arr[]=new int[a];
        int count=0;
        for(int i=0;i<a;i++){
          arr[i]=obj.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]==b){
                count++;
                
            }
            
            }
            if(count!=0){
                System.out.print(count);
            }
            else{
                System.out.print(-1);
            }
        }
        
    }
