package cn.com.mode.ChainOfResponsibility;

public class ConcreteHandlerA extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 0 && request < 10) {
			System.out.println("A处理请求");
		} else {
			if (superior != null) {

				// 转移到下一位
				superior.handleRequest(request);
			}
		}

	}

}
