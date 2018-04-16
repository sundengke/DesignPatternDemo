package cn.com.mode.facade;

/**
 * 外观模式： 实现一个功能时，需要调用 大量的类。逻辑较为复杂时
 * 将操作流程封装成外观类：方便外部调用接口。
 * /**
 * 外观类。对子系统进行一定程度调用的封装
 * 
 */
public class Facade {
	SubSystemOne subSystemOne;
	SubSystemTwo subSystemTwo;
	SubSystemThree subSystemThree;
	//.....
	
	public Facade() {
		subSystemOne =new SubSystemOne();
		subSystemTwo =new SubSystemTwo();
		subSystemThree =new SubSystemThree();
		//.....
	}
	
	//暴露出对其他类的不同的调用方式。方便客户端使用
	public void methodA(){
		System.out.println("方法组A");
		subSystemOne.concreteMethod();
		subSystemTwo.concreteMethod();
		//....
	}
	
	public void methodB(){
		System.out.println("方法组B");
		subSystemOne.concreteMethod();
		subSystemTwo.concreteMethod();
		subSystemThree.concreteMethod();
		//....
	}

}
