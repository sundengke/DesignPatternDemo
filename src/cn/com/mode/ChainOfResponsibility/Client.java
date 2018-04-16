package cn.com.mode.ChainOfResponsibility;

public class Client {
	public static void main(String[] args) {
		
		Handler h1 =new ConcreteHandlerA();
		Handler h2 =new ConcreteHandlerB();
		Handler h3 =new ConcreteHandlerC();
			
		//设置职责链上家和下家
		h1.setSuperior(h2);
		h2.setSuperior(h3);
		
		int[] requests ={2,5,14,22,18,3,27,20};
		
		//循环给最小处理者提交请求，不同的数额，由不用权限处理者处理
		for(int request : requests){
			h1.handleRequest(request);
		}
		
		
		
	}
}
