/*
 * ��̬��Ӧ�á�������������
 * ÿ��Ӧ�ó����ж��й��ԵĹ��ܣ�
 * ���Խ���Щ���ܽ��г�ȡ�����з�װ���Ա㸴��
 * 
 * 
 * 
 * �Ͻ����������캯����ʼ����ֱ�����������ã��������ö���Ĳ���
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
