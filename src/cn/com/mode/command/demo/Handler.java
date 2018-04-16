package cn.com.mode.command.demo;

public class Handler {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void excuteCommand(){
		command.excute();
	}
	

}
