package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//�޼ҵ� ���ο����� Ŭ������ ������ �� �ִ�.
		//Local Inner Class
		class Gura{
			public void say() {
				System.out.println("�ȳ� ���� ���� ��");
			}
		}
		Gura g=new Gura();
		g.say();
	}
}
