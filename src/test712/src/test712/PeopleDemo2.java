package test712;

public class PeopleDemo2 {
	public static void main(String[] args) {
		/*People a1 = new People();
		People a2 = new People("wang");
		People a3 = new People("wang",23);  */
		People p1 = new People(20);
		People p2 = new People(20);
		boolean b = p2.compare(p1);
		System.out.println(b);
	}
}
