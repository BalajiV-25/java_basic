import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }

        int count = 0;
        int min=arr[0];
        for(int i = 1; i < n; i++){
            if(min >arr[i]) {
                    min = arr[i];
                    count=i;
                
            }
        }
        if(count==0){
            System.out.print("-1");
        }
        else{
            System.out.print(count);
        }
    }
}
/*Sample Input:
5
15 18 2 3 6 12


Sample Output:
2*/
