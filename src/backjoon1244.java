import java.util.Scanner;

public class backjoon1244 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sw[] = new int [n];
		
		for(int i = 0; i< n; i++) {
			sw[i] = in.nextInt();
		}
		
		int st = in.nextInt();
		for(int i = 0; i< st; i++) {
			int sex = in.nextInt();
			int num = in.nextInt();
			sw =Solution(sex,num,sw);
		}
		for(int x : sw) {
			System.out.printf(x+ " ");
		}
		}

	static int[] Solution(int S, int N, int[] SW) {
		int [] answer = SW;
		
		if(S==1) {
			for(int i = 1; i<=SW.length/N;i++) {
				answer[i*N-1] = numberChange(answer[i*N-1]);
			}
		}
		else {
			if(N==1 || N==SW.length) return answer;
			else {
			int left = N-1;
			int right = N+1;
			answer[N-1] = numberChange(answer[N-1]);
			int b = Math.min(N,SW.length-N);
			for(int i = 0; i<b-1;i++) {
				
				if(answer[left-1]==answer[right-1]) {
					answer[left-1] = numberChange(answer[left-1]);
					answer[right-1] = numberChange(answer[right-1]);
					left-=1;
					right+=1;
				}
				else break;
			}
			}
		}
		
		return answer;
	}
	static int numberChange(int a) {
		if(a == 0) return 1;
		else return 0;
	}
}
