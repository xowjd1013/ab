import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 동적 프로그래밍(Dynamic Programming) : 재귀 호출 시, 반복적으로 계산되는 것들의 계산 횟수를 줄이기 위해 이전에 계산했던 값을 저장해두었다가 나중에 재사용하는 방법이다. 
 									메모이제이션이 동적 프로그래밍 중 하나.
*/


// Bottom-up
public class baekjoon1463_1 {
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n = Integer.parseInt(br.readLine());
		int []dp = new int [n+1];
		dp[0] = 0;
		dp[1] = 0;
		for(int i = 2; i<=n; i++) {
			dp[i] = dp[i-1] +1;
			if(i%2==0) dp[i]=Math.min(dp[i],dp[i/2]+1);
			if(i%3==0) dp[i]=Math.min(dp[i],dp[i/3]+1);
		}
		System.out.println(dp[n]);
	
	}
	/* 바텀업 함수 정의{
		1. 동적 배열 생성
		2. for(2~num)까지 돌면서 dp[]의 인덱스 값마다 최소 cnt를 계산
			2-1. dp[i] = dp[i-1] +1
			2-2. 2로 나누어 떨어졌을때, 3으로 나누어 떨어졌을때 최소값 각각 비교
		3. dp[num]을 리턴 
	*/
	
	
	
}
