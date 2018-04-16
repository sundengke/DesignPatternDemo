package cn.com.mode.adapter;

/**
 * 适配器类需要继承 客户需要的接口类
 * 
 * 类中创建特殊类的实例，使用通用的接口将   特殊的接口包裹起来。
 */
public class Adapter extends Target {
	public Adaptee adaptee =null;
	
	public void request() {
		if (adaptee == null) {
			adaptee =new Adaptee();
		}
		adaptee.specialRequest();
	}
	
	
}
