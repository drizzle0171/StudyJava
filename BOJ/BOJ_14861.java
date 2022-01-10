import java.util.Scanner;

public class BOJ_14861 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int dotX = input.nextInt();
		int dotY = input.nextInt();
		
		if (dotX > 0 & dotY > 0) {
			System.out.println(1);
		} else if (dotX > 0 & dotY < 0) {
			System.out.println(4);
		} else if (dotX < 0 & dotY > 0) {
			System.out.println(2);
		} else {
			System.out.println(3);
		} 
	}

}
