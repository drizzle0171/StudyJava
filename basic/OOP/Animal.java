public class Animal { //���ϸ��� �� public �ٿ��ֱ�
	String name; //Animal Ŭ������ String ���� �߰� -> ��ü ����
	
	//��ü ������ �� ���� - �޼ҵ� �̿� (���̽��� �Լ�)
	//�ڹٿ����� Ŭ������ ���� �� �� ���� = �Լ� ���� ����! = �޼ҵ�
	//�Է�: String name
	//���: void (���ϰ� ����)
	public void/*���� �ڷ���*/ setName/*�޼ҵ��*/(String name) {
		this.name = name; //���⿡ boby ����
		//this = self
		//���� ���ϰ��� ����!
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
