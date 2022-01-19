import java.util.Scanner;
import java.util.Arrays;

public class BOJ_2562 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] Arr = new int[9];
		
		for (int i = 0; i<9;i++) {
			Arr[i] = input.nextInt();
		}
		
		int[] Arr_copy = Arr;
		Arrays.sort(Arr_copy);
		
		System.out.println(Arr_copy[8]);
		
		for (int i = 0; i<9; i++) {
			if ( Arr_copy[8] == Arr[i]) {
				System.out.println(i);
			}
		}
	}

}
