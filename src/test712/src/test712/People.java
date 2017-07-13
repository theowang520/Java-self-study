/*
 * private:私有，权限修饰符，修饰成员变量，成员函数
 * 私有只在本类中有效
 * 将age私有化以后，类以外即使建立了对象也不能直接访问
 * 但人应该有年龄，需要在People类中提供对应访问age的方式
 * 封装不是私有，私有是封装的一种表现形式
 * 之所以对外提供访问方式，因为可以在访问方式中加入逻辑判断等语句
 */

/*
 * 构造函数 与类名相同 不用定义返回类型 不可以写return语句
 * 给对象进行初始化
 * 对象一建立 就调用与之对应的构造函数
 * 当一个类中没有定义构造函数，系统默认给该类加入一个空参数的构造函数如Peole(){}
 * 当在类中自定义构造函数后，默认构造函数没有了
 * 一个对象建立，构造函数就执行且只执行一次，一般方法可多次调用
 */

/*
 * 构造代码块：
 * 给对象初始化
 * 对象一建立就运行，优先于构造函数运行
 * 构造代码块给所有对象统一初始化 不同对象共性的初始化内容
 * 构造函数给对应对象初始化
 */

/*
 * this:代表本类对象，
 * this代表它所在函数所属对象的引用
 * 简单说哪个对象在调用this所在的函数，this就代表哪个对象
 * 当定义类中函数时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象
 */

/*
 * 构造函数间调用用this 必须是第一行
 */
package test712;

public class People {
	/*private int age;
	void setAge(int a) {
		if (a>0 && a<130) {
			age = a;			
			speak();
		}			
		else 
			System.out.println("false");
	}	
	void speak() {
		System.out.println("age="+age);
	}*/
	private String name;
	private int age;
	//构造代码块
	{
		System.out.println("hhhh");
	}
	People()  //构造函数
	{
		System.out.println("name="+name+"..age="+age);
		//System.out.println("666");
	}
	People(String name){
		this.name = name;
		System.out.println("name="+this.name+"..age="+age);
	}
	People(int a){
		
		age = a;
		System.out.println("name="+name+"..age="+age);
	}
	People(String name,int age){
		this(name);
		this.age=age;
	}
	public boolean compare(People p) {
		return this.age == p.age;
	}
}
