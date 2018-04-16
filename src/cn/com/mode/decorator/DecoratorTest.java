package cn.com.mode.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		
		Component component =new ConcreteComponent();
		Decorator d1 =new ConcreteDecoratorA();
		Decorator d2 =new ConcreteDecoratorB();
		
		//对具体的操作进行 装饰
		d1.setComponent(component);
		d2.setComponent(d1);
		d2.operation();
		
		
	}

}
