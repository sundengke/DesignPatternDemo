package cn.com.mode.command;

/**
 * 优势：
 * 1.能较容易地设计一个命令队列
 * 2.需要时，可以较容易地将命令记入日志
 * 3.允许接受请求的一方  决定是否要否决请求
 * 4.容易实现对请求的撤销 和 重做
 * 5.加入新的具体命令类不影响其他类，
 * 6.把请求一个操作的对象 和 执行这个操作的对象 分割开
 * 
 *
 */
public class Client {
	public static void main(String[] args) {
		
	//执行 命令模式之前实例化需要的类
	Receiver receiver =new Receiver();
	Invoker invoker =new Invoker();
	Command command =new ConcreteCommand(receiver);
	
	//只需要 调用Invoker就可以，使其通知 执行command 的 receiver
	invoker.setCommand(command);
	invoker.excuteComman();
	}
}
