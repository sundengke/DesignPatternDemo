package cn.com.mode.abstractFactory;

/**
 * 可以用抽象工厂创建具体的实例
 * 并在改变需求时，不许改动原有的代码
 */
public class FactoryTest {
	
	public static void main(String[] args) {
		AbstractFactory factory =new OneFactory();
		
		User user1 =factory.createUser();
		Department department1 =factory.createDepartment();
		
		
		AbstractFactory factory2 =new TwoFactory();
		
		User user2 =factory2.createUser();
		Department department2=factory2.createDepartment();
		
		
		
	}
}
