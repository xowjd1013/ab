import java.util.Scanner;

public class backjoon1166 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		long N = in.nextInt();
		long L = in.nextInt();
		long W = in.nextInt();
		long H = in.nextInt();
		double low = 0;

		double high = Math.min(Math.min(L,W),H);

		for(int i = 0; i<10000; i++) {
			double mid = (low+high)/2;
			if((long)(L/mid)*(long)(W/mid)*(long)(H/mid)>=N) low = mid;
			else high = mid;
			
		}
		
		System.out.println(high);
		System.out.println(low);
	}
}
