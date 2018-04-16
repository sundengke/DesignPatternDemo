package cn.com.mode.abstractFactory;

/**
 * 需要添加修改功能是 符合 对扩张开放 ，对修改关闭 的原则 
 *
 */
public class TwoFactory implements AbstractFactory {


	@Override
	public User createUser() {
		return new ConcreteUserTwo();
	}

	@Override
	public Department createDepartment() {
		return new ConcreteDepartmentTwo();
	}

}
