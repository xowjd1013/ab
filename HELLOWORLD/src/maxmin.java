import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
// Array.sort�� �̿��� Ǯ��
/*public class maxmin {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   
		   int N = sc.nextInt();
		   int[] array = new int[N];
		   String a = sc.nextLine();     //nextInt() �޼ҵ� ������ nextLine() �޼ҵ带 �����Ϸ��� �Ҷ� nextLine()�޼ҵ尡 �׳� �Ѿ������ ������ ���ܳ���.   
		   String b = sc.nextLine();       
		   StringTokenizer st ;	        
	        st = new StringTokenizer(b);
        
        for(int i =0 ; i<N ; i++) {
        	array[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[N-1]);
     
	}

}
*/

// for���� �̿��� Ǯ��
public class maxmin {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);                                                                                                                  
		   int N = sc.nextInt();
		   int[] array = new int[N];
		   String a = sc.nextLine();     
		   String b = sc.nextLine();       
		   StringTokenizer st ;	        
	        st = new StringTokenizer(b);
        
        for(int i =0 ; i<N ; i++) {
        	array[i] = Integer.parseInt(st.nextToken());
        }
        int max = array[0];
        int min = array[0];
        for(int i =0 ; i<N ; i++) {       	
			if (max <=array[i]) {
				max = array[i];				                                				
			}
        }
        
        for(int i =0 ; i<N ; i++) {       	
			if (min >= array[i]) {
				min = array[i];				                                				
			}
        }
             
        System.out.println(min + " " + max);
     
	}

}
