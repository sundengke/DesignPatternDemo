package cn.com.mode.adapter;

/**
 * 使用接口时可以 不需要了解特殊接口的结构，
 * 
 * 就可以通过适配器来调用  特殊的接口
 * @author sundk
 */
public class Client {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}

}
