package cn.com.mode.simpleFactory;

public class Operation {

	public double numberA;
	public double numberB;
	
	
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	

	public  double getResult(){
		double result = 0;
		return result;
		
	}
}

/*
switch (operateType) {
case "+":
	result =numberA + numberB;
	break;
case "-":
	result =numberA - numberB;
	break;
	
case "*":
	result =numberA * numberB;
	break;
case "/":
	
	if(numberB == 0){
		
	}
	result =numberA / numberB;
	break;

default:
	break;
}*/