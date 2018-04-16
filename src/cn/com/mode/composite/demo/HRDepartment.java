package cn.com.mode.composite.demo;

public class HRDepartment extends Compony {

	public HRDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Compony compony) {

	}

	@Override
	public void remove(Compony compony) {

	}

	@Override
	public void display(int depth) {

	}

	@Override
	public void LineOfDuty() {
		System.out.println(name+":人事部门的具体职责");
	}

}
