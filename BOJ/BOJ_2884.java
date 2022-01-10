import java.util.Scanner;

public class BOJ_2884 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int H = input.nextInt();
		int M = input.nextInt();
		
		// H°¡ 0ÀÏ ¶§
		if (M>=45) {
			M -= 45;
		} else {
			M += 15;
			if (H==0) {
				H = 23;
			} else {
				H -= 1;
		}
		}
		System.out.printf("%d %d", H, M);
	}

}
