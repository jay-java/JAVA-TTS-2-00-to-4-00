package core;

public class P006_Loops {
	public static void main(String[] args) {
		for (int i = 10; i <= 5; i++) {
			System.out.println("i = " + i);
		}

		int j = 1;
		while (j <= 5) {
			System.out.println(j);
			j++;
		}

		int k = 10;
		do {
			System.out.println(k);
			k++;
		} while (k <= 5);
	}
}
