package cn.com.mode.factory;

public class FactoryTest {

	public static void main(String[] args) {
		Factory operFactory =new AddFactory();
		Operation operation =operFactory.createOperation();
		operation.numberA =2;
		operation.numberB =3;
		operation.getResult();
		
	}
}
