package cn.com.mode.abstractFactory;

/**
 * 拥有多个具体Factory 的工厂方法
 * 抽象工厂 其实就是工厂模式  中 抽象出的工厂类中含有多个方法
 * 
 * 
 * 
 */
public interface AbstractFactory {
	 User createUser();
	 Department createDepartment();
}
