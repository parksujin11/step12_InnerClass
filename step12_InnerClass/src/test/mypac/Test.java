package test.mypac;

public class Test {
	//class안에 또 다른 class 만들 수 있다.
	//Gura type 객체를 생성해서 리턴해 주는 메소드
	public Gura getGura() {
		return new Gura();
	}
	//Monkey type 객체를 생성해서 리턴해 주는 메소드
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	
	//내부 클래스 (innerclass) 편리함때문에 클래스 안에 클래스 지정할 수 있다. 
	public static class Gura{
		public void say() {
			System.out.println("안녕 나는 구라양");
		}
	}
	//내부 클래스 
	public class Monkey{
		public void say() {
			System.out.println("안녕 나는 원숭이양");
		}
}
}