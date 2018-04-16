package cn.com.mode.ChainOfResponsibility;

public class ConcreteHandlerC extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println("C处理请求");
		} else {
			if (superior != null) {
				// 转移到下一位
				superior.handleRequest(request);
			}
		}

	}

}
