
public class Dog extends Animal{ //Animal ���
//IS-A ���� (��Ӱ���)
	public Dog() {
		
	}
	// �������� �Է��׸� x + ������ ���� x -> ����Ʈ ������
	public void sleep() {
		System.out.println(this.name+" zzz");
	}
	public static void main(String[] args) {
		Dog dog = new Dog(); 
		//�̷��Գ�
		Animal doggy = new Dog();
		//�̷��Ե� ���� ����! (����߱� ������! - ��� sleep ����)
		doggy.setName("bobby");
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
	}
}
