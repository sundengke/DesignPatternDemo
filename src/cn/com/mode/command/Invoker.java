package cn.com.mode.command;

/**
 * 处理请求
 */
public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void excuteComman(){
		command.excute();
	}

}
