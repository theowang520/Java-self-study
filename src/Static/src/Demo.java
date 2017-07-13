/*
 * 静态的应用————工具类
 * 每个应用程序中都有共性的功能，
 * 可以将这些功能进行抽取，进行封装，以便复用
 * 
 * 
 * 
 * 严谨化：将构造函数初始化，直接用类名调用，减少无用对象的产生
 */
public class Demo {
	public static void main(String[] args) {
		int[] arr = {3,4,1,8};
		int max = 0;
		for(int x=1; x<arr.length; x++) {
			if(arr[x]>arr[max])
				max = x;
		}
		System.out.println("max="+getMax(arr));
	}
	public static int getMax(int[] arr) {
		int max = 0;
		for(int x=1; x<arr.length; x++) {
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}
}
