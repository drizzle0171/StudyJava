import java.util.Scanner;

public class BOJ_11021 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int Test = input.nextInt();
		
		for (int i=1;i<Test+1;i++) {
			
			Scanner input_case = new Scanner(System.in);
			
			int A = input_case.nextInt();
			int B = input_case.nextInt();
			
			System.out.printf("Case #%d: %d", i ,A+B);
		}

	}

}
