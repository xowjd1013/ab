import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class buffer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선언
		StringTokenizer st ; //특정 문자에 따라 문자열을 나누고 싶을 때 사용한다.
		int t = Integer.parseInt(br.readLine()); // BufferedReader는 항상 String으로 받으므로 입력값을 정수로 사용하려면 형변환이 필요하다
		for (int a = 0 ; a<t ; a++) {
		st = new StringTokenizer(br.readLine());
		bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n" );
		}
		bw.close();
	}

}
