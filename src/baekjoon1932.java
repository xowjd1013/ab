

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* <알고리즘 구현 방법>
 *	정수 삼각형값을 2차원 배열 Triangle[][]에 입력받는다.
 *	맨 밑단 부터 인접한 인덱스 두 개의 값을 비교하여 더 큰 값을 
 *	비교한 인덱스들이 공통으로 가리키는 인덱스의 값과 더해서 그 자리에 덮어쓴다.
 *	같은 방식으로 모두 덮어쓰면 [0][0]자리 인덱스가 최댓값이 된다.
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