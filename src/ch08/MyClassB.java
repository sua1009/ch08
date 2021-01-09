package ch08;

// 우리회사 클래스
// 기능 추가 방식 
// 1. 다른 인터페이스를 생성하여 다중 상속을 사용
// 2. 기존 인터페이스에 디폴트 메서드를 추가하여 기능을 추가 
public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassB의 method1 실행");	
	}

//	@Override
//	public void method2() {
//		System.out.println("MyClassB의 method2 실행");
//	}
	
	
}
