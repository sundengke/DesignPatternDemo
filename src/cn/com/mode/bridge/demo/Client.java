package cn.com.mode.bridge.demo;

public class Client {

	public static void main(String[] args) {
		Brand phone1 =new ConcreteBrandOne();
		phone1.setAbility(new ConcreteAbilityOne());
		phone1.oprerate();
		phone1.setAbility(new ConcreteAbilityThree());
		phone1.oprerate();
		phone1.setAbility(new ConcreteAbilityTwo());
		phone1.oprerate();
		
		
		
		Brand phone2 =new ConcreteBrandTwo();
		phone2.setAbility(new ConcreteAbilityOne());
		phone2.oprerate();
		phone2.setAbility(new ConcreteAbilityThree());
		phone2.oprerate();
		phone2.setAbility(new ConcreteAbilityTwo());
		phone2.oprerate();

	}

}
