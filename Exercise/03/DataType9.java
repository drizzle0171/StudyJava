import java.util.HashMap;

public class DataType9 {

	public static void printCoffeePrice(int type) {
		HashMap<Integer, Integer> priceMap = new HashMap<>();
		priceMap.put(1, 3000);
		priceMap.put(2, 4000);
		priceMap.put(3, 5000);
		int price = priceMap.get(type);
		System.out.println(String.format("가격은 %d원입니다.", price));
	}
	
	public static void sample(null) {
		printCoffeePrice(1);
		printCoffeePrice(99);
	}
}

	public static void main(String[] args) {
		enum CoffeeType {
			AMERICANO,
			ICE_AMERICANO,
			CAFE_LATTE
		};
	}

// 이 부분은 더 공부하기