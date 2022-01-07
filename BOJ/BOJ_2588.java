import java.util.Scanner;

public class BOJ_2588 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		
		int three =A*(B%10);
		double four = A*Math.ceil(B/10%10);
		double five = A*Math.ceil(B/100);

		System.out.println(three);
		System.out.println((int)four);
		System.out.println((int)five);
		System.out.println(three+(int)four*10+(int)five*100);
		

	}

}
