import java.util.Scanner;

public class backjoon1124 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int answer =0;
		boolean flag = false;
		
		for(int j = a; j<=b; j++) {
			flag = false;	
			if(j == 2) {
				flag=true;
			}
		for(int i = 2; i<j; i++ ) {
			System.out.println(Prime(j,1));
			if(Prime(j,1) == 1) {
				flag = true;
				break;
			}
			if(Prime(j,1) == 2) {
				break;
			}
			if(Prime(j,1) % i== 0) {
				flag = true;
				break;
			}
			
			
		}
		if(flag==false) {
//			System.out.println(j);
//			System.out.println(Prime(j,1));
			answer++;
		}
	}
		System.out.println(answer);
//		System.out.println(Prime(2,1));
//		System.out.println(Prime(3,1));
//		System.out.println(Prime(4,1));
//		System.out.println(Prime(5,1));
//		System.out.println(Prime(6,1));
//		System.out.println(Prime(7,1));
//		System.out.println(Prime(8,1));
//		System.out.println(Prime(9,1));
//		System.out.println(Prime(10,1));
//		System.out.println(Prime(100,1));
//		System.out.println(Prime(111,1));
//		System.out.println(Prime(112,1));
//		System.out.println(Prime(113,1));
//		System.out.println(Prime(114,1));
//		System.out.println(Prime(115,1));
		
		
		
	}

	static int Prime(int i, int b) {
		//		System.out.println(i);
		//		System.out.println(b);
		int cnt = b;
		for(int k = 2; k<i; k++) {
			if(i%k==0) {
				cnt++;
				cnt = Prime(i/k,cnt);
				break;
			}
		}

		return cnt;
	}


}
