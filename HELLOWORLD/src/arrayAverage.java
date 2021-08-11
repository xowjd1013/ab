import java.util.Scanner;

public class arrayAverage {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float sum=0;
		int N = sc.nextInt();
		
		float [] arr = new float [N];
		for(int i = 0; i<=N-1; i++) {
			arr[i]=sc.nextInt();			
		}
		float M = arr[0];
		for(int i = 0; i<=N-1; i++) {
			if(M<=arr[i]) {
				M=arr[i];
			}
			
		}
		System.out.println("ÃÖ´ñ°ª:"+ M);
		for(int i = 0; i<=N-1; i++) {
			arr[i]=arr[i]/M*100;
			sum+=arr[i];
		}
		
		System.out.println(sum/N);
		
		sc.close();
	}

}
