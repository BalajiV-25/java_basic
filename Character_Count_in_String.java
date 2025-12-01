import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String user = obj.next();
        char ch = obj.next().charAt(0);
        int cout = 0;
        char[] charArray = user.toCharArray();
        
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] == ch){
                cout++;
            }
        }
        if(cout != 0){
            System.out.println(cout);
        }
        else{
            System.out.println("-1");
        }
     
    }
}
