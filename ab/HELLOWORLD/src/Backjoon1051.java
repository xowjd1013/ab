import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon1051 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		int n = Integer.parseInt(line.split(" ")[0]);
		int m = Integer.parseInt(line.split(" ")[1]);
		int a = Math.min(n,m);
//		System.out.println(a);
		int answer = 0;
		int [][] t = new int [n][m];
		for(int i = 0; i<n; i++) {
			line = br.readLine();
			for(int j=0; j<m; j++) {
				t[i][j] = Integer.parseInt(line.split("")[j]);
//				System.out.println(t[i][j]);
			}
		}
		breakout:
		while(a>0) {
		for(int i = 0; i<=n-a;i++) {
			for(int j =0; j<=m-a; j++) {
//				System.out.println(t[i][j]);
//				System.out.println(t[i+a-1][j]);
//				System.out.println(t[i][j+a-1]);
//				System.out.println(t[i+a-1][j+a-1]);
				
				if(t[i][j]==t[i][j+a-1]) {
					if(t[i][j]==t[i+a-1][j] && t[i][j+a-1]==t[i+a-1][j+a-1]) {
						answer = a*a;
						System.out.println(answer);
						break breakout;
					}
				}
			
			}		
		}
		a--;
		}

		br.close();
		
	}

}
