package core;

class XYZ{
	static int i =1;
	public void call() {
		System.out.println("call fun : "+i);
	}
	public static void calling() {
		System.out.println("static calling : "+i);
	}
}
public class P017_StaticKey {
	public static void main(String[] args) {
		XYZ x = new XYZ();
		x.call();
		XYZ.calling();
	}
}
