import java.util.Scanner;

public class BOJ_2438 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for (int i = 1; i<N+1;i++) {
			for (int j = 1; j<i+1;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
