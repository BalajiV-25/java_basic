import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int target = input.nextInt();  
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;

        for(int i = 0; i < num; i++){
            if(arr[i] < target){
                if(count > 0){
                    System.out.print(" ");  
                }
                System.out.print(arr[i]);
                count=1;
            }
        }

        if(count == 0){
            System.out.print("-1");
        }
    }
}
