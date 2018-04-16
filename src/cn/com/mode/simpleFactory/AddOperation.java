package cn.com.mode.simpleFactory;

public class AddOperation extends Operation {

	@Override
	public double getResult() {
		double result =0;
		result =numberA+ numberB ;
		return result;
	}
	
	

}
