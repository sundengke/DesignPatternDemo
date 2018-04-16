package cn.com.mode.composite.demo;

public abstract class Compony{
	protected String name;
	public Compony(String name) {
		this.name =name;
	}
	
	public abstract void add(Compony compony); 
	public abstract void remove(Compony compony); 
	public abstract void display(int depth);
	public abstract void LineOfDuty();
}