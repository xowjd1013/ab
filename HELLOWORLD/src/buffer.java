import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class buffer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //����
		StringTokenizer st ; //Ư�� ���ڿ� ���� ���ڿ��� ������ ���� �� ����Ѵ�.
		int t = Integer.parseInt(br.readLine()); // BufferedReader�� �׻� String���� �����Ƿ� �Է°��� ������ ����Ϸ��� ����ȯ�� �ʿ��ϴ�
		for (int a = 0 ; a<t ; a++) {
		st = new StringTokenizer(br.readLine());
		bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n" );
		}
		bw.close();
	}

}
