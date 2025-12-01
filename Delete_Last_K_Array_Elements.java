import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int M = obj.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=obj.nextInt();
        }
        int b= arr.length-M;
        for(int i=0;i<b-1;i++ ){
        System.out.print(arr[i]+" ");}
        for(int i=b-1;i<b;i++){
            System.out.print(arr[i]+"");
        }
    }
}
