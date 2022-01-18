import java.util.Scanner;
import java.util.Arrays;

public class BOJ_10818 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i<N; i++) {
			arr[i] = input.nextInt(); //Scanner은 여러번 써도 된다!
		}
		
		input.close(); //Scanner 닫기 
		Arrays.sort(arr); //이걸로 정렬! (최솟값 -> 최댓값 순)
		System.out.print(arr[0] + " " + arr[N-1]);
	}

}
