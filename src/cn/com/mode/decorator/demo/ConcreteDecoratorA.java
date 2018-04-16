package cn.com.mode.decorator.demo;

public class ConcreteDecoratorA extends Decorator {
	// 本类的独有的功能，以区别于ConcreteDecoratorB
	private String addedState;

	/**
	 * 具体的装饰类中 ，只注重自己的方法实现，无需考虑所装饰对象的方法。
	 */
	@Override
	public void operate() {
		super.operate();
		addedState = "new state";
		System.out.println("具体装饰对象A的操作");
	}
}
