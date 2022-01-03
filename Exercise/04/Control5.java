public class Control5 {

	public static void main(String[] args) {
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		int result = 0;
		for (int mark: marks) {
			result += mark;
		}
		System.out.println(result/10);

	}

}
