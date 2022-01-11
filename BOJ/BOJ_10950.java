import java.util.Scanner;

public class BOJ_10950 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int Test = input.nextInt();
		
		for (int i = 1; i<Test+1; i++) {
			Scanner inputnum = new Scanner(System.in);
			
			int A = inputnum.nextInt();
			int B = inputnum.nextInt();
			
			System.out.println(A+B);
		}
	}

}
