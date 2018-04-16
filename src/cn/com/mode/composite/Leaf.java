package cn.com.mode.composite;

/**
 * 叶子不能再增加分枝和树叶，所以add和remove方法实现它没有意义，
 * 但这样做可以消除 叶节点 和 枝干节点对象在抽象层次的区别。
 * 使其去呗完全一致的接口
 */
public  class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Cannot remove to a leaf");
	}

	@Override
	public void display(int depth) {
		System.out.println("-"+depth+"^^"+name);
	}
	
}