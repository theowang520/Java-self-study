package car;

public class cardamo {
	public static void main(String[] args) {
		//demo daben = new demo();
		show(new demo ());
	}

		public static void show(demo c){
		c.num = 3;
		c.color = "black";
		c.run();
	}
}