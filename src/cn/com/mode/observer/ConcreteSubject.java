package cn.com.mode.observer;

public class ConcreteSubject extends AbstractSubject {
	//具体观察者的装填
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
}
