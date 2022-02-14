import java.util.Scanner;

public class alarm {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		int A = 0 ;
		if(M < 45) {
			H -= 1;
			A = 60 + (M-45);
			if(H < 0) {
				H = 23 ;
			}
		}
		else {
			A = M- 45;
		}


		System.out.println(H + " " + A);
	}
}
