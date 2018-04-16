package cn.com.mode.template;

public class TemplateTest {
	public static void main(String[] args) {
		//模板模式对代码的复用
		AbstractClass c;
		c= new ConcreteClassA();
		c.templateMethod();
		
		c= new ConcreteClassB();
		c.templateMethod();
		
		
	}

}
