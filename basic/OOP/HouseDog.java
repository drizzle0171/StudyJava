
public class HouseDog extends Dog{
	
	public HouseDog(String name) {
		this.setName(name);
	}
	//�޼ҵ�� = Ŭ������ + ���� �ڷ��� ���� x -> ������
	public void sleep() {
		System.out.println(this.name+" zzz in house");
	} 
	//sleep�� Dog������ sleep�� �̸��� �Ȱ����� ���⼭ ���̴� HouseDog���� �켱����! = �޼ҵ� �������̵�
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for "+hour+"hours");
	} 
	//�Է��� �ٸ� ������ �̸��� �޼ҵ� ���� = �޼ҵ� �����ε�
	
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("HAPPY");
		houseDog.sleep();
		houseDog.sleep(3);
	}
}

// ����� �ڹٴ� ���� ����� �������� ����~!

/*
������: ��ü������ ���� ������ �����ؾ߸� ��ü�� ������ �� �ֵ��� ��
*/