
import java.util.Scanner; 

public class forunder {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("배열 n을 입력하시오 :");
        int n = in.nextInt();
        System.out.println("제한 x을 입력하시오 :");
        int x = in.nextInt();
        for(int a = n; a>=1 ; a--){
            int b = in.nextInt();
            if(b<x){
                System.out.println(b);
            }
        }
    }
}