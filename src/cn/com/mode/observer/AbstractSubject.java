package cn.com.mode.observer;

import java.util.LinkedList;
import java.util.List;
/**
 * 被观察的主题 or 抽象通知者 
 * 公共的部分：
 *	提供一个接口，用来添加和删除观察者对象
 * 并通知 观察者改变自己的状况。
 */
public abstract class AbstractSubject {
	//观察者的队列
	private List<AbstractObserver> observers =new LinkedList<AbstractObserver>();
	
	public void attach(AbstractObserver observer) {
		observers.add(observer);
	}
	public void detach(AbstractObserver observer) {
		observers.remove(observer);
	}
	/**
	 * 通知方法
	 */
	public void notifyObservers(){
		for(AbstractObserver o : observers){
			o.update();
		}
	}
	
	
}
