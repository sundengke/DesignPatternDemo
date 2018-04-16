package cn.com.mode.abstractFactory;

/**
 * 需要添加修改功能是符合对  扩张   开放 对  修改   关闭 的原则 
 *
 */
public class OneFactory implements AbstractFactory {

	@Override
	public User createUser() {
		return new ConcreteUserOne();
	}

	@Override
	public Department createDepartment() {
		return new ConcreteDepartmentOne();
	}

}
