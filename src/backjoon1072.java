import java.util.Scanner;

public class backjoon1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = getPercent(x, y);
        int ans = -1;
        int left = 0;
        int right = 1000000000;
        
        //이분 탐색 
        while(left<=right) {
        	int mid = (left+right)/2;
        	
        	if(getPercent(x+mid,y+mid) != z) { //절반 값으로 탐색 했는데 변화 o? -> 오른 쪽 범위로 계산
        		right=mid-1;
        		ans = mid;
        	}else {				//변화 x? -> 왼쪽 범위로 계산
        		left=mid+1;
        	}
        	
        }
        
        System.out.println(ans);
        
    }
     
    static int getPercent(int x, int y) {
        return (int) ((long) y * 100 / x);
    }
}