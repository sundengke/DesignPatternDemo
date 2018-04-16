package cn.com.mode.memento;

/**
 * 发起人：
 * 
 * 需要被备份状态的类
 * 其中需要包含：  1.创建Memento的方法    2.获取Memento中备份的方法
 *
 */
public class Originator{
	private String state;

	public Originator() {
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		return new Memento(this.state);
	}
	
	public void setMemento(Memento memento) {
		this.state =memento.getState();
	}
	
	public void showState(){
		System.out.println("当前的状态是：" +this.state);
	}
	
}