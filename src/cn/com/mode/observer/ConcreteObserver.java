package cn.com.mode.observer;

public class ConcreteObserver extends AbstractObserver {
	private String name;
	private String observerState="没有更新";
	private ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject,String name) {
		this.subject =subject;
		this.name =name;
	}
	@Override
	public void update() {
		observerState =updateObserverState(subject);
		System.out.println("观察者的新状态是"+name+observerState);
	}
	
	private String updateObserverState(ConcreteSubject subject) {
		switch (subject.getSubjectState()) {
		case "主题的具体状态":
			return observerState;
		case "X":
			return "X";
		case "Y":
			return "Y";

		default:
			break;
		}
		return observerState;
	}
	public ConcreteSubject getSubject() {
		return subject;
	}
	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
	
	
	
}
