//import java.util.Scanner;
//
////�迭�� �̿��� Ǯ��
//public class arrayRemain {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		int count = 0;
//		boolean []arr = new boolean [42];
//		for (int i = 0; i<=9; i++) {
//			arr[sc.nextInt() % 42] = true;			
//		}
//		for(int j = 0; j<=41; j++) {
//			if(arr[j] == true) {
//				count++;
//			}
//			
//
//		}
//		System.out.println(count);
//
//	}
//}

//Hashset�� �̿��� Ǯ��
import java.util.Scanner;
import java.util.HashSet;
//�迭�� �̿��� Ǯ��
public class arrayRemain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i =0; i<=9; i++) {
		h.add(sc.nextInt()%42);
		}
		sc.close();
		System.out.println(h.size());
		
		
}
}

