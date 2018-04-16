package cn.com.mode.decorator;

/**
 * 执行装饰操作的类。
 * 处理 被装饰的类  同时 也可作为被装饰的类
 * 
 * extends 抽象被修饰的类，使用更加灵活
 */
public abstract class Decorator extends Component {
	
	Component component =null;
	
	//装饰类 设置 Component
	public void setComponent(Component component) {
		this.component = component;
	}
	
	/**
	 * 实际执行的是Component的operation()方法
	 * 
	 * 但可在原操作的基础上进行功能的添加 
	 */
	@Override
	public void operation() {
		if (component !=null) {
			component.operation();
		}
	}
	
	

}
