

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * <Top-Down(����Լ� ����)>
 * 
 * 
 *  �޸�: 15868KB	�ð� : 152ms
 *  
 *  */



//public class baekjoon1003 {
//	static int[][]dp=new int [41][2]; // 0<N<41 , N�� ���� ��µǴ� 0,1������ ������ �迭
//									  // ��α׸� ���� int�� �ƴ� Integer�迭�� �����ϸ� nullüũ�� �� �� �ִٰ� ��.
//	public static void main(String[] args) throws NumberFormatException,  IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());	//�Է� ���� ����
//		
//		//�Ǻ���ġ���� ù°, ��°�� 0,1�� ������ ����
//		dp[0][0] = 1;
//		dp[0][1] = 0;
//		dp[1][0] = 0;
//		dp[1][1] = 1;
//		
//		
//		for(int i = 0; i<T; i++) {
//			int N =Integer.parseInt(br.readLine());
//			fibonacci(N);	
//			System.out.println(dp[N][0]+" " +dp[N][1]);
//		}
//		
//	}
//	
//	public static int[] fibonacci(int n) {
//
//		if(dp[n][0]==0 && dp[n][1]==0) {
//		
//		
//		dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
//		dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
//	
//		}
//		return dp[n];
//	}
//	
//
//}
/*
 * <Bottom-Up>
 * 
 * 
 *  �޸�: 16180	KB	�ð� : 160ms
 *  
 *  �Ϲ������� bottom-up������ �޸� ȿ���� ���ٰ� ������ ArrayList�� 2�� �����ؼ� �׷���
 *  �� �Ҹ� ���ߴ�.
 *  
 *  */

/*  */
public class baekjoon1003 {
	static ArrayList<Integer>dp_zero = new ArrayList<Integer>();
	static ArrayList<Integer>dp_one= new ArrayList<Integer>();
	
	public static void main(String[] args) throws NumberFormatException,  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		dp_zero.add(1);
		dp_one.add(0);
		dp_zero.add(0);
		dp_one.add(1);
		
		for(int i = 0; i<T; i++) {
			int N =Integer.parseInt(br.readLine());
			fibonacci(N);			
		}
		
	}
	
	public static void fibonacci(int n) {
		
		if(dp_zero.size()>n || dp_one.size()>n) {	// dp�� n�� �ش��ϴ� ���� �̹� ������ �ٷ� ���
			System.out.println(dp_zero.get(n)+" " +dp_one.get(n));
		}
		
		else {
		for(int i =dp_zero.size(); i<=n; i++) {		//������ 2���� n���� dp�� �������ش�.
		dp_zero.add(dp_zero.get(i-1)+dp_zero.get(i-2)); 
		dp_one.add(dp_one.get(i-1)+dp_one.get(i-2)); 
		}
		System.out.println(dp_zero.get(n)+" " +dp_one.get(n));
		}
	}
	

}