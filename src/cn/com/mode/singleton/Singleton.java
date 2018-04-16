package cn.com.mode.singleton;

//todo  饿汉懒汉：多线程下的单例
/**
 * 单例的实例化与否的过程 应该是主动性的，应该在自己的类中完成，而不是在客户端
 * 
 * 声明一个私有的静态变量，
 * 并设置私有的构造方法 ： 让外界无法去实例化自己。
 * 
 * 设置一个public 方法，开放给外部： 客户端调用该方法创建实例
 */
public class Singleton {
	//
	private static Singleton instance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance(){
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
