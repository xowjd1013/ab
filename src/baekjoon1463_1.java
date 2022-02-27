import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 ���� ���α׷���(Dynamic Programming) : ��� ȣ�� ��, �ݺ������� ���Ǵ� �͵��� ��� Ƚ���� ���̱� ���� ������ ����ߴ� ���� �����صξ��ٰ� ���߿� �����ϴ� ����̴�. 
 									�޸������̼��� ���� ���α׷��� �� �ϳ�.
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
	/* ���Ҿ� �Լ� ����{
		1. ���� �迭 ����
		2. for(2~num)���� ���鼭 dp[]�� �ε��� ������ �ּ� cnt�� ���
			2-1. dp[i] = dp[i-1] +1
			2-2. 2�� ������ ����������, 3���� ������ ���������� �ּҰ� ���� ��
		3. dp[num]�� ���� 
	*/
	
	
	
}
