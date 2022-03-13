

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * <Top-Down(재귀함수 구현)>
 * 
 * 
 *  메모리: 15868KB	시간 : 152ms
 *  
 *  */



//public class baekjoon1003 {
//	static int[][]dp=new int [41][2]; // 0<N<41 , N에 따라 출력되는 0,1개수를 저장할 배열
//									  // 블로그를 보니 int가 아닌 Integer배열로 생성하면 null체크를 할 수 있다고 함.
//	public static void main(String[] args) throws NumberFormatException,  IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());	//입력 받을 개수
//		
//		//피보나치에서 첫째, 둘째는 0,1로 정해져 있음
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
 *  메모리: 16180	KB	시간 : 160ms
 *  
 *  일반적으로 bottom-up구조가 메모리 효율이 높다고 하지만 ArrayList를 2개 생성해서 그런지
 *  더 소모가 심했다.
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
		
		if(dp_zero.size()>n || dp_one.size()>n) {	// dp에 n에 해당하는 값이 이미 있으면 바로 출력
			System.out.println(dp_zero.get(n)+" " +dp_one.get(n));
		}
		
		else {
		for(int i =dp_zero.size(); i<=n; i++) {		//없으먼 2부터 n까지 dp를 정의해준다.
		dp_zero.add(dp_zero.get(i-1)+dp_zero.get(i-2)); 
		dp_one.add(dp_one.get(i-1)+dp_one.get(i-2)); 
		}
		System.out.println(dp_zero.get(n)+" " +dp_one.get(n));
		}
	}
	

}