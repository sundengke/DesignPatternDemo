package cn.com.mode.ChainOfResponsibility;

public class ConcreteHandlerB extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 10 && request < 20) {
			System.out.println("B处理请求");
		} else {
			if (superior != null) {

				// 转移到下一位
				superior.handleRequest(request);
			}
		}

	}

}
