import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DataType8 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
		HashSet<Integer> numbers2 = new HashSet<>(numbers);
		System.out.println(numbers2);
	}

}
