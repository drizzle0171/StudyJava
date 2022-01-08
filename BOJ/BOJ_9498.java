import java.util.Scanner;

public class BOJ_9498 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		char grade;
		
		if (score>=90 && score<=100) {
			grade = 'A';
		} else if (score>=80 && score<90) {
			grade = 'B';
		} else if (score>=70 && score<80) {
			grade ='C';
		} else if (score>=60 && score<70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade);
		}
}
