package cn.com.mode.command;

/**
 * 该类知道如何实施和执行一个与请求相关的操作，任何类都可能作为一个接受者
 */
public class Receiver {
	public void action(){
		System.out.println("执行请求！！");
	}
}
