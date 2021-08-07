import java.util.Arrays;
import java.util.Scanner;

public class arrayEach {
	public static void main (String []args){
		Scanner sc = new Scanner (System.in);
		int count = 0;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = A * B * C ;
		String t = Integer.toString(X);
		System.out.println(X);
		String [] array = t.split("");
		System.out.println(Arrays.toString(array));
//		for(int i = 0; i <=array.length ; i++){
//			System.out.println(array[i]);
//		}
		for(int j = 0; j <=9 ; j++){
			for(int l = 0; l <= array.length -1 ; l++){
				if(Integer.toString(j).equals(array[l])){
					count++;
				}
				
			}
			System.out.println(count);
			count=0;
		}
	}
}

