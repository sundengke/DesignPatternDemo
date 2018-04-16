package cn.com.mode.simpleFactory;

public class SimpleFactory {
	
	
	
	public static Operation getInstance(String operationType){
		Operation operation=null;
		switch (operationType) {
		case "+":
			operation =new AddOperation();
			
			break;
			
			//.....

		default:
			break;
		}
		
		
		
		return operation;
	}
	

}
