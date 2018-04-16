package cn.com.mode.memento;

/**
 * 备忘录 模式：用来存储用户某一时刻的状态
 * 
 * 在发起者中通过构造方法将相关数据导入
 */
public class Memento{
	
	private String state;
	
	public Memento(String state) {
		this.state=state;
	}
	
	public String getState(){
		return this.state;
	}
	
	
}