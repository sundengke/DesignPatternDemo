package cn.com.mode.ChainOfResponsibility;

/**
 * 职责链模式：
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * 
 * 
 */
public abstract class Handler {
	Handler superior;
	
	public void setSuperior(Handler superior) {
		this.superior = superior;
	}
	
 	public abstract void handleRequest(int request);

}
