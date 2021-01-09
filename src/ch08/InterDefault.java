package ch08;

public interface InterDefault {

	public void method1();
	public void method2();
	
	public default void InterDefaultmethod() {
		System.out.println("InterDefault method");
	}
}
