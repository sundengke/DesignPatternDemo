package cn.com.mode.strategy;

//维护队抽象Strategy 的引用，但是用具体的ConcreteStrategy来配置
public class Context {
	Strategy strategy;
	/*public Context(Strategy strategy) {
		this.strategy=strategy;
		
	}*/
	
	public Context(String type) {
		switch (type) {
		case "A":
			this.strategy=new ConcreteStrategyA();
			break;
		case "B":
			this.strategy=new ConcreteStrategyB();
			break;
		default:
			break;
		}
	}
	
	public void contextInterface(){
		strategy.method();
	}
	
	Strategy strategy2 =null;
	public Context(Strategy	strategy) {
		this.strategy2=strategy;
	}
	
	

}
