import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int length = word.length();
        int mid=length/2;
        if(length==1){
            System.out.print("*");
        }else{
            if(length%2!=0){
            for(int i=0;i<length;i++){
                if(i==mid){
                    System.out.print("*");
                }else{
                    System.out.print(word.charAt(i));
                }
            }
        }else{
            for(int i=0;i<length;i++){
                if(i == mid || i== mid-1){
                    System.out.print("*");
                }else{
                    System.out.print(word.charAt(i));
                }
            }
        }
        }
    }
}