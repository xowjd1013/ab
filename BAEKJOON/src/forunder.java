
import java.util.Scanner; 

public class forunder {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("�迭 n�� �Է��Ͻÿ� :");
        int n = in.nextInt();
        System.out.println("���� x�� �Է��Ͻÿ� :");
        int x = in.nextInt();
        for(int a = n; a>=1 ; a--){
            int b = in.nextInt();
            if(b<x){
                System.out.println(b);
            }
        }
    }
}