public class Control2 {

	public static void main(String[] args) {
		int num = 1;
		while (true) {
			int result = 3*num;
			System.out.println(result);
			num++;
			
			if (num>1000) {
				break;
			}
		}

	}

}
