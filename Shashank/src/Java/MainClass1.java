package Java;

public class MainClass1 {

	static int a=test1();
	static int b=test1()+test2();
	static int test1() {
		System.out.println("test1");
		int b=10;
		return b;
	}
	static int test2() {
		System.out.println("test2");
		int c=20;
		return c;
	}
	public static void main(String[] args) {
		System.out.println("maiclass");
		System.out.println(a);
		System.out.println(b);

	}

}
