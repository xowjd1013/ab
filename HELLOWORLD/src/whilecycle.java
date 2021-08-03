import java.util.Scanner;

public class whilecycle {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);	
		int count = 0;
		int a = sc.nextInt();
		if(a<10) {
			a*=10;
		}
		int num1 = a/10;
		int num2 = a%10;
		int num3 = num1 + num2;
		
		while(count>=1) {
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		System.out.println("num3 :" + num3);
		System.out.println("count :" + count);
			int b =num1*10 + num2;
			if(num3>=10) {
				num3 -= 10;
			}
			if(a==b) {
				System.out.println(count);
				break;
			}
			count++;
		}
	}
}



//Scanner sc = new Scanner (System.in);	
//int i = 1;
//String a = sc.next();
//int c = Integer.parseInt(a);
//
//int num1 = a.charAt(0) -'0';
//int num2 = 0;
//
//if(c<10) {
//	num2 = num1;
//	num1 = 0;
//	
//}
//else {
// num2 = a.charAt(1) -'0';
//}
//
//int num3 = num1 + num2;
//
//
//
//while(i>=1) {
//	num1 = num2;
//	num2 = num3;
//	num3 = num1 + num2;
////	System.out.println("num1 :" + num1);
////	System.out.println("num2 :" + num2);
////	System.out.println("num3 :" + num3);
//	if(num3>=10) {
//		num3 -= 10;
//	}
//	String b = Integer.toString(num1) + Integer.toString(num2);
//	int d = Integer.parseInt(b);
//
//	if(c==d) {
//		System.out.println(i);
//		break;
//	}
//	i++;
//
//
//}