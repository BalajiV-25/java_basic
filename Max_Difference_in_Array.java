import java.util.*;
public class Main {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[n-1]-arr[0]);
        
    }
}
