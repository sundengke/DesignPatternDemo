package cn.com.mode.decorator.demo;

public class ConcreteDecoratorB extends Decorator {
	
	@Override
	public void operate() {
		super.operate();
		addedBehavior();
		System.out.println("具体装饰对象B的操作");
	}
	
	private void addedBehavior(){
		System.out.println("ConcreteDecoratorB类中添加的新功能");
		
	}

}
