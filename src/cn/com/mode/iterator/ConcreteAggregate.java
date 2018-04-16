package cn.com.mode.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * 具体的集合类。         在其中添加创建 迭代器的方法 ---指向 ----》抽象的迭代器
 *
 */
public class ConcreteAggregate extends Aggregate {
	private List<Object> items =new LinkedList<Object>();
	
	@Override
	Iterator createIterator() {
		return new ConcreteIteratorDesc(this);
	}

	public List<Object> getItems() {
		return items;
	}

	public void setItems(List<Object> items) {
		this.items = items;
	}
	
	
}
