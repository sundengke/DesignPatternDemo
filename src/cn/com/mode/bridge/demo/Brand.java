package cn.com.mode.bridge.demo;

/**
 * 在自己内部，实现抽象的功能类或接口的实例，通过接口编程，添加   各个具体功能
 *
 */
public abstract class Brand {
	private Ability ability;
	
	public Brand(){
		
	}
	
	public void setAbility(Ability ability) {
		this.ability=ability;
	}
	
	public void oprerate(){
			ability.operate();
		
	}

}
