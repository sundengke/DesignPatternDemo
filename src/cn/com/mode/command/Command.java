package cn.com.mode.command;

/**
 * command是发送给receiver的
 */
public abstract class Command {
	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver=receiver;
	}
	
	public abstract void excute(); 
	

}
