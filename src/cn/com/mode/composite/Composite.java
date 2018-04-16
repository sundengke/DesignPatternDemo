package cn.com.mode.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 组合模式
 * 
 * 定义有枝节点行为，用来存储子部件。
 * 在Component接口中实现与子部件有关的操作。
 * 如：添加  和  删除
 */
public  class Composite extends Component{
	private List<Component> childer =new LinkedList<Component>();
	public Composite(String name) {
		super(name);
	}
	@Override
	public void add(Component component) {
		childer.add(component);
	}

	@Override
	public void remove(Component component) {
		childer.remove(component);
	}

	@Override
	public void display(int depth) {
		System.out.println("-"+depth+"^^"+name);
		
		for(Component component : childer){
			component.display(depth+1);
		}
	}
	
}