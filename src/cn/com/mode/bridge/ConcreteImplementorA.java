package cn.com.mode.bridge;

public class ConcreteImplementorA extends Implementor {

	@Override
	public void operation() {
		System.out.println("具体实现A的方法执行");
	}
}
