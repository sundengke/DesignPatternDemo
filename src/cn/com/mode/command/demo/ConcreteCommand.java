package cn.com.mode.command.demo;

public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void excute() {
		receiver.justDo();
	}


}
