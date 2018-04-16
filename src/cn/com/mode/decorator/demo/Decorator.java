package cn.com.mode.decorator.demo;

public abstract class Decorator extends Embellished{
	public Embellished embellished;
	
	public void setEmbellished(Embellished embellished) {
		this.embellished = embellished;
	}

	@Override
	public void operate() {
		if (embellished !=null) {
			embellished.operate();
		}
		
	}
	
	
	
}
