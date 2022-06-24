package cn.demo.static1;

/**
 * 
 * @author Administrator
 *
 */

public class Students {   

	static String name;
	// 创建一个静态代码块
	static {
		System.out.println("这是一个静态代码块" + name);
	}
	//创建一个非静态代码块
	static {
		System.out.println("这是一个非静态代码块" + name);
	}
	//创建一个初始化代码块/构造代码块
	{
		System.out.println("这是一个初始化代码块");
	}
	//创建一个构造方法
	public Students(String name) {
		Students.name = name;
		System.out.println("这是一个构造方法" + name);
	}
	//创建一个成员方法
	public void students() {
		System.out.println("这是一个成员方法" + name);
	}
	public static void main(String[] args) {
		Students s = new Students("Tig");
//		s.students();
//		Students s;
	}
}
