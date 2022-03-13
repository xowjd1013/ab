

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* <�˰��� ���� ���>
 *	���� �ﰢ������ 2���� �迭 Triangle[][]�� �Է¹޴´�.
 *	�� �ش� ���� ������ �ε��� �� ���� ���� ���Ͽ� �� ū ���� 
 *	���� �ε������� �������� ����Ű�� �ε����� ���� ���ؼ� �� �ڸ��� �����.
 *	���� ������� ��� ����� [0][0]�ڸ� �ε����� �ִ��� �ȴ�.
 * */


public class baekjoon1932 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int Triangle[][] = new int [N][N];
		for(int i=0; i<N; i++ ) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			for(int j=0; j<N; j++ ) {
				if(st.hasMoreTokens()==false) continue;
				else Triangle[i][j] = Integer.parseInt(st.nextToken());			
			}
		}
		
		
		for(int i=N-1; i>0; i-- ) {
			for(int j=0; j<N-1; j++) {
				Triangle[i-1][j]=Triangle[i-1][j]+Math.max(Triangle[i][j],Triangle[i][j+1]);
				
			}
		}

//		System.out.println(Arrays.deepToString(Triangle));
//		System.out.println(Arrays.deepToString(dp));
		
		System.out.println(Triangle[0][0]);
	}
	


}