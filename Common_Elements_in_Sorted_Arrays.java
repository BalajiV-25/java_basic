import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        sc.close();
        
        // Use a list to store elements we want to print
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[j] == arr[i]) {
                    resultList.add(arr1[j]);
                }
            }
        }
        
        if (resultList.isEmpty()) {
            System.out.print("-1");
        } else {
            // Print the list elements separated by a single space
            for (int i = 0; i < resultList.size(); i++) {
                System.out.print(resultList.get(i));
                // Only print a space if it's not the last element
                if (i < resultList.size() - 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}
