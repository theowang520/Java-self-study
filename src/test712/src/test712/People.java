/*
 * private:˽�У�Ȩ�����η������γ�Ա��������Ա����
 * ˽��ֻ�ڱ�������Ч
 * ��age˽�л��Ժ������⼴ʹ�����˶���Ҳ����ֱ�ӷ���
 * ����Ӧ�������䣬��Ҫ��People�����ṩ��Ӧ����age�ķ�ʽ
 * ��װ����˽�У�˽���Ƿ�װ��һ�ֱ�����ʽ
 * ֮���Զ����ṩ���ʷ�ʽ����Ϊ�����ڷ��ʷ�ʽ�м����߼��жϵ����
 */

/*
 * ���캯�� ��������ͬ ���ö��巵������ ������дreturn���
 * ��������г�ʼ��
 * ����һ���� �͵�����֮��Ӧ�Ĺ��캯��
 * ��һ������û�ж��幹�캯����ϵͳĬ�ϸ��������һ���ղ����Ĺ��캯����Peole(){}
 * ���������Զ��幹�캯����Ĭ�Ϲ��캯��û����
 * һ�������������캯����ִ����ִֻ��һ�Σ�һ�㷽���ɶ�ε���
 */

/*
 * �������飺
 * �������ʼ��
 * ����һ���������У������ڹ��캯������
 * ������������ж���ͳһ��ʼ�� ��ͬ�����Եĳ�ʼ������
 * ���캯������Ӧ�����ʼ��
 */

/*
 * this:���������
 * this���������ں����������������
 * ��˵�ĸ������ڵ���this���ڵĺ�����this�ʹ����ĸ�����
 * ���������к���ʱ���ú����ڲ�Ҫ�õ����øú����Ķ���ʱ����ʱ��this����ʾ�������
 */

/*
 * ���캯���������this �����ǵ�һ��
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
	//��������
	{
		System.out.println("hhhh");
	}
	People()  //���캯��
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
