package cn.com.mode.memento;

public class Client {

	public static void main(String[] args) {
		Originator originator =new Originator();
		originator.setState("up");
		originator.showState();
		
		CareTaker careTaker =new CareTaker();
		careTaker.setMemento(originator.createMemento());
		
		originator.setState("Off");
		originator.showState();
		
		originator.setMemento(careTaker.getMemento());
		originator.showState();
	}
}
