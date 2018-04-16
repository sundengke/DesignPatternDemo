package cn.com.mode.builder;

/**
 * 实例化具体的创造者
 * 并封装创造过程，向外部暴露统一职责的接口
 *
 */
public class PersonDirector {
	
	private PersonBuilder builder;
	public PersonDirector(ConcretePersonBuilderA builder) {
		this.builder =builder;
	}
	
	public void createPerson(){
		builder.buildHead();
		builder.buildBody();
		builder.buildArmLeft();
		builder.buildArmRight();
		builder.buildLegLeft();
		builder.buildLegRight();
	}
	
	

}
