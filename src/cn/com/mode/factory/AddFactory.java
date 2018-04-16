package cn.com.mode.factory;

/**
 * 需要添加修改功能是 符合 对扩张开放 ，对修改关闭 的原则 
 *
 */
public class AddFactory implements Factory {

	@Override
	public Operation createOperation() {
		return new AddOperation();
	}

}
