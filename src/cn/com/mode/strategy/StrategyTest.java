package cn.com.mode.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Context context=null;
		String type="A";
		context =new Context("A");
		// 将选择交给Context处理
		// 若用简单工厂改造，客户端不需要考虑使用哪个策略
		context.contextInterface();
		
//		Context context2 ;
//		context2 =new Context(new ConcreteStrategyA());
	}
	

}
