package cn.com.mode.simpleFactory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		Operation operation =null;
		operation =SimpleFactory.getInstance("+");
		operation.numberA=2;
		operation.numberB=3;
		operation.getResult();
		
		
	}
}
