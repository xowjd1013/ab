import java.util.Scanner;

public class arrayMax {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		int [] array = new int [9];
		for(int i = 0; i<array.length;i++) {
			array[i] = sc.nextInt();
			
		}
		int max = array[0];
		for(int i = 0; i<array.length;i++) {
			if(max<=array[i]) {
				max = array[i];
			}
		}
		for(int i = 0; i<array.length;i++) {
			if(max == array[i]) {
		System.out.println(max + " " + (i+1) );
			}
		}
	}
}
