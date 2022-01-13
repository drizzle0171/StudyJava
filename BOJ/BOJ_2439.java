import java.util.Scanner;

public class BOJ_2439 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for (int i = 1; i<N+1;i++) {
			for (int j = 1; j<=N-i;j++) {
				System.out.print(' ');
			}
			for (int k = 0; k<i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
