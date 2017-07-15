/*
 * final：作为修饰符
 * 1.可以修饰类、变量、函数
 * 2.被final修饰的类不可以被继承
 * 3.被final修饰的方法不可以复写
 * 4.被final修饰的变量是一个常量只能赋值一次
 * 
 */


//final class Demo{
//	void show() {
		
//	}
//}
class Demo{
	final double PI = 3.14;
	final void show() {
		
	}
}
class SubDemo extends Demo{	
//	void show() {}
		
	}


class FinalDemo {

}
