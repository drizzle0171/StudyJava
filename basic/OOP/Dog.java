
public class Dog extends Animal{ //Animal 상속
//IS-A 관계 (상속관계)
	public Dog() {
		
	}
	// 생성자의 입력항목 x + 생성자 내부 x -> 디폴트 생성자
	public void sleep() {
		System.out.println(this.name+" zzz");
	}
	public static void main(String[] args) {
		Dog dog = new Dog(); 
		//이렇게나
		Animal doggy = new Dog();
		//이렇게도 선언 가능! (상속했기 때문에! - 대신 sleep 못씀)
		doggy.setName("bobby");
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
	}
}
