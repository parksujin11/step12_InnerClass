package test.mypac;

public class Test {
	//class�ȿ� �� �ٸ� class ���� �� �ִ�.
	//Gura type ��ü�� �����ؼ� ������ �ִ� �޼ҵ�
	public Gura getGura() {
		return new Gura();
	}
	//Monkey type ��ü�� �����ؼ� ������ �ִ� �޼ҵ�
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	
	//���� Ŭ���� (innerclass) ���Զ����� Ŭ���� �ȿ� Ŭ���� ������ �� �ִ�. 
	public static class Gura{
		public void say() {
			System.out.println("�ȳ� ���� �����");
		}
	}
	//���� Ŭ���� 
	public class Monkey{
		public void say() {
			System.out.println("�ȳ� ���� �����̾�");
		}
}
}