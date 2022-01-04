
public class HouseDog extends Dog{
	
	public HouseDog(String name) {
		this.setName(name);
	}
	//메소드명 = 클래스명 + 리턴 자료형 정의 x -> 생성자
	public void sleep() {
		System.out.println(this.name+" zzz in house");
	} 
	//sleep은 Dog에서의 sleep과 이름이 똑같지만 여기서 쓰이는 HouseDog에서 우선순위! = 메소드 오버라이딩
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for "+hour+"hours");
	} 
	//입력이 다른 동일한 이름의 메소드 생성 = 메소드 오버로딩
	
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("HAPPY");
		houseDog.sleep();
		houseDog.sleep(3);
	}
}

// 참고로 자바는 다중 상속을 지원하지 않음~!

/*
생성자: 객체변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 함
*/