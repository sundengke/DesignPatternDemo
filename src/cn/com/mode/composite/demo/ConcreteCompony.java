package cn.com.mode.composite.demo;

import java.util.LinkedList;
import java.util.List;

/**
 * 具体的子公司
 */
public class ConcreteCompony extends Compony {
	private List<Compony> children = new LinkedList<Compony>();

	public ConcreteCompony(String name) {
		super(name);
	}

	@Override
	public void add(Compony compony) {
		children.add(compony);
	}

	@Override
	public void remove(Compony compony) {
		children.remove(compony);
	}

	@Override
	public void display(int depth) {
		System.out.println(children.toString());
		System.out.println("-" + depth + "^^" + name);

		for (Compony compony : children) {
			compony.display(depth + 1);
		}
	}

	@Override
	public void LineOfDuty() {
		for (Compony compony : children) {
			compony.LineOfDuty();
		}
	}

}
