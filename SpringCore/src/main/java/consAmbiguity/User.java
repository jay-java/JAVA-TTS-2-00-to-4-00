package consAmbiguity;

public class User {

	private int a;
	private int b;

	User(int a, int b) {
		System.out.println("data set by int cons");
		this.a = a;
		this.b = b;
	}

	User(double a, double b) {
		System.out.println("data set by double cons");
		this.a = (int) a;
		this.b = (int) b;
	}

	User(String a, String b) {
		System.out.println("data set by String cons");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	@Override
	public String toString() {
		return "User [a=" + a + ", b=" + b + "]";
	}

}
