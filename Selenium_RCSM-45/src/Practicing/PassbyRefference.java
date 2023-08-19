package Practicing;

/*class jhgdsf {
	public void disp() {
		System.out.println("kushi");
	}
}*/
class Sample {
	public static void test(int s) {
		System.out.println("shashank");
		System.out.println(s); 
	}
}
public class PassbyRefference {
	public static void main(String[] args) {
		int s=10;
		Sample.test(s);
	}
}