import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon1057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line =br.readLine();
		int n =Integer.parseInt(line.split(" ")[0]);
		int k =Integer.parseInt(line.split(" ")[1]);
		int l =Integer.parseInt(line.split(" ")[2]);
		int answer = 0;
		while(k!=l) {
			k=k/2+k%2;
			l=l/2+l%2;
			
			answer++;
		}
		System.out.println(answer);
	}

}
