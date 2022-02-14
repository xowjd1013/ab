import java.util.Scanner;

public class multiplication {
	public static void main (String []args) {
		int A;
		String B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.next();
		sc.close();
		System.out.println(A*(B.charAt(2)-'0'));
		System.out.println(A*(B.charAt(1)-'0'));
		System.out.println(A*(B.charAt(0)-'0'));
		System.out.println(A*Integer.parseInt(B));

		
	}
	
}
