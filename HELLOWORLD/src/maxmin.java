import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
// Array.sort를 이용한 풀이
/*public class maxmin {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   
		   int N = sc.nextInt();
		   int[] array = new int[N];
		   String a = sc.nextLine();     //nextInt() 메소드 다음에 nextLine() 메소드를 실행하려고 할때 nextLine()메소드가 그냥 넘어가버리는 오류가 생겨난다.   
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

// for문을 이용한 풀이
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
