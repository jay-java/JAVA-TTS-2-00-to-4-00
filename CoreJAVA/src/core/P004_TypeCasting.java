package core;

public class P004_TypeCasting {
	public static void main(String[] args) {
		byte b = 12;//1
		int i = b;//4
		System.out.println(i);
		
		
		int j = 12;//4
		byte b1 = (byte)j;//1
		System.out.println(b1);
		
		double dd = 3;
		System.out.println(dd);
		
		double f = 3.14;
		int i1  = (int)f;
		System.out.println("i1 = "+i1);
		
		
		
		int a = 10,d= 3;
		double c = (double)a/(double)d;
		System.out.println(c);
		
		String s = "1";
		int s_int = Integer.parseInt(s);
		System.out.println(s_int);
		
		int q = 12;
		String s1 = String.valueOf(q);
		System.out.println(s1);
		
	}
}
