public class Animal { //파일명에는 꼭 public 붙여주기
	String name; //Animal 클래스에 String 변수 추가 -> 객체 변수
	
	//객체 변수에 값 대입 - 메소드 이용 (파이썬의 함수)
	//자바에서는 클래스를 떠나 살 수 없음 = 함수 따위 없다! = 메소드
	//입력: String name
	//출력: void (리턴값 없음)
	public void/*리턴 자료형*/ setName/*메소드명*/(String name) {
		this.name = name; //여기에 boby 전달
		//this = self
		//여긴 리턴값이 없음!
	}
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("boby");
		System.out.println(cat.name);
		
		Animal dog = new Animal();
		dog.setName("happy");
		System.out.println(dog.name);
	}
}
