package test.mypac;

public class Factory {
	public Car car=new Car() {
		@Override
		public void drive() {
			System.out.println("���� �޷��� ");
		}
	};
	
	//�ɹ� �ʵ忡 �ִ� Car ��ü�� ����ϴ� �޼ҵ�
	public void useCar() {
		car.drive();
	}
	public Car getCar() {
		return car;
	}
}