package cn.com.mode.memento;

/**
 * 管理者  保存Memento
 * 客户端中，用户通过CareTaker设置和获取 Memento
 */

public class CareTaker{
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}