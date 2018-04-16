package cn.com.mode.iterator;

public class Client {
	public static void main(String[] args) {
		
		ConcreteAggregate a=new ConcreteAggregate();
		a.getItems().add("111");
		a.getItems().add("222");
		a.getItems().add("333");
		a.getItems().add("444");
		
		Iterator iterator=new ConcreteIterator(a);
		Object item =iterator.first();
		System.out.println(item);
		
		while(!iterator.isDone()){
			System.out.println(iterator.currentTime());
			iterator.next();
			
		}
		
		
	}
}
