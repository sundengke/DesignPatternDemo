package cn.com.mode.iterator;

/**
 * 定义具体的迭代器的 公共方法（必须的方法
 */
public abstract class Iterator{
	
	public abstract Object first();
	public abstract Object next();
	public abstract boolean isDone();
	public abstract Object currentTime();
	
	
}