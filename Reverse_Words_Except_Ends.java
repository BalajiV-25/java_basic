import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() <= 2) {
                result.append(word);
            } else {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                String reversedMiddle = new StringBuilder(middle).reverse().toString();
                result.append(first).append(reversedMiddle).append(last);
            }
            result.append(" "); 
        }
        System.out.println(result.toString().trim());
    }
}
