package cn.com.mode.observer;

/**
 * 也叫 Publish/Subscribe  模式
 */
public class ObserverTest {
	public static void main(String[] args) {
		ConcreteSubject s= new ConcreteSubject();
		
		s.attach(new ConcreteObserver(s, "X"));
		s.attach(new ConcreteObserver(s, "Y"));
		s.attach(new ConcreteObserver(s, "Z"));
		
		s.setSubjectState("X");
		s.notifyObservers();
		
		
		
	}
}