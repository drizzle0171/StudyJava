import java.util.Scanner;

public class BOJ_1110 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int cnt = 0;
		int ori =  N;
		
		while (true) {
			int sum = (int)(N/10) + N%10 ;
			int new_n = 10*(N%10) + sum%10 ;
			cnt++;
			N = new_n;
			if (ori == new_n) {
				System.out.println(cnt);
				break;
			}
		}
	}

}
