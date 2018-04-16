package cn.com.mode.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Proxy proxy =new Proxy();
		//代理了realSubject的request方法
		proxy.request();
	}

}
