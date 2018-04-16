package cn.com.mode.iterator;

/**
 * 具体的迭代器类 ：   1.  定义下标
 * 					2.	构造方法中创建具体集合的实例。
 * 
 * 
 */

public class ConcreteIterator extends Iterator {
	private int current;
	private ConcreteAggregate aggregate;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.getItems().get(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if (current < aggregate.getItems().size()) {
			ret = aggregate.getItems().get(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.getItems().size() ? true : false;
	}

	@Override
	public Object currentTime() {
		return aggregate.getItems().get(current);
	}

}
