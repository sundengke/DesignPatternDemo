package cn.com.mode.command.demo;

/**
 * 在具体的命令类中调用    接受者 处理信息的方法。
 * 
 * 将每一个命令抽象出来，
 * 让handler处理类直接与 命令的父类 联系。
 * 
 */
public class Client {
	public static void main(String[] args) {
		Handler handler =new Handler();
		Receiver receiver =new Receiver();
		Command command =new ConcreteCommand(receiver);
		
		handler.setCommand(command);
		handler.excuteCommand();
		
		
		
		
		
	}
}
