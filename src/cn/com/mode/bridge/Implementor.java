package cn.com.mode.bridge;

/**
 * 实现
 * 
 * 桥接模式：将抽象部分与它的实现部分分离，使它们都可以独立地变化
 * 
 * 抽象与它的实现分离: 不是让抽象类与其派生类分离，
 * 					  是指，抽象类和他的派生类用来实现自己的对象
 *   例子：手机可以按照 1.品牌分类，也可按照2.功能分类
 */
public abstract class Implementor {
	
	public abstract void operation();

}
