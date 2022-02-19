import java.util.Scanner;

public class backjoon1198 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x[] = new int [n];
		int y[] = new int [n];
		for(int i = 0; i<n; i++) {	
			x[i]=in.nextInt();
			y[i]=in.nextInt();
		}
		int ax[] = new int [3];
		int ay[] = new int [3];
		double max = 0;
		double answer = 0;
		for(int i=0; i<n-2; i++) {
			for(int j=1+i; j<n-1; j++) {
				for(int k=1+j; k<n; k++) {
					ax[0]=x[i];
					ay[0]=y[i];
					ax[1]=x[j];
					ay[1]=y[j];
					ax[2]=x[k];
					ay[2]=y[k];
					max = Solution(ax,ay);
					if(max>answer) answer = max;
				}
			}			
		}


		System.out.println(answer);
	}

	static double Solution(int ax[], int ay[]) {

		double a = (ax[0]*ay[1])+(ax[1]*ay[2])+(ax[2]*ay[0]); 
		double b = (ax[1]*ay[0])+(ax[2]*ay[1])+(ax[0]*ay[2]); 
		double answer = Math.abs(a-b)/2; 
		return answer;
	}
}
