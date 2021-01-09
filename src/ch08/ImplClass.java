package ch08;

public abstract class ImplClass implements Inter{

	@Override
	public void method1() {
		System.out.println("Inter에서 상속받은 추상메서드 method1");
	}
	
	@Override
	public void method2() {
		System.out.println("Inter에서 상속받은 추상메서드 method2");
	}
	
//	인터페이스 inter에서 상속받읕 추상메서드 mothod3을 구현하지 않을 경우 해당 클래스는
//	추상 클래스가 됨 
//	@Override
//	public void method3(){
//	
//	}

}
