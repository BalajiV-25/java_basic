import java.util.*;
class Main {
    static int countOccurrences(String s, String word) {
        int count = 0;
        String curr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (curr.equals(word)) {
                    count++;
                }
                curr = "";
            }

            else {
                curr += s.charAt(i);
            }
        }
        if (curr.equals(word)) {
            count++;
        }

        return count;
    }
  
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String word=sc.next();
        int res = countOccurrences(s, word);
        if(res>0){
            System.out.print(res);
        }else{
                System.out.print("-1");
        }
    
    }
}
