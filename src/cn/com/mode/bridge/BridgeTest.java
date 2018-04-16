package cn.com.mode.bridge;

/**
 * 桥接模式：
 * 
 *
 */
public class BridgeTest {
	public static void main(String[] args) {
		Abstraction abstraction =new RefineAbstraction();
		
		abstraction.setImplementor(new ConcreteImplementorA());
		abstraction.operation();
		
		abstraction.setImplementor(new ConcreteImplementorB());
		abstraction.operation();
		
		
	}
}
