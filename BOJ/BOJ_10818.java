import java.util.Scanner;
import java.util.Arrays;

public class BOJ_10818 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i<N; i++) {
			arr[i] = input.nextInt(); //Scanner�� ������ �ᵵ �ȴ�!
		}
		
		input.close(); //Scanner �ݱ� 
		Arrays.sort(arr); //�̰ɷ� ����! (�ּڰ� -> �ִ� ��)
		System.out.print(arr[0] + " " + arr[N-1]);
	}

}
