/*
 * static 静态
 * 是一个修饰符，用于修饰成员变量，成员函数
 * country不占用内存，对象共享
 * 成员被静态修饰后，多了一个调用方式，除了可以被对象调用，还可以被类名直接调用（类名.静态成员）
 * 方法区：类中的方法和共享数据
 * static特点
 * 1随着类的加载而加载，随类的消失而消失  
 * 2优先于对象存在
 * 3被所有对象所共享
 * 4可以直接被类名所调用
 */

public class Person {
	String name;
	static String country = "cn";
	public void show() {
		System.out.println(name+"::"+country);
	}
}
