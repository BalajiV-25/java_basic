import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) {
            System.out.println("-1");
            sc.close();
            return;
        }
        
        String s1 = sc.next();
        String s2 = sc.next();
     
        Set<Character> charsToRemove = new HashSet<>();
        for (char c : s2.toCharArray()) {
            charsToRemove.add(c);
        }
        StringBuilder resultS1 = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (!charsToRemove.contains(c)) {
                resultS1.append(c);
            }
        }
        if (resultS1.length() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(resultS1.toString());
        }
    }
}
/*Sample Input:
GUVI GEEK


Sample Output:
UVI*/
