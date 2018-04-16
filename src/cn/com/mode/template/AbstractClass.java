package cn.com.mode.template;

public abstract class AbstractClass {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	public void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("其他重复出现的方法");
		
		
	}
	
	
	
	
}
