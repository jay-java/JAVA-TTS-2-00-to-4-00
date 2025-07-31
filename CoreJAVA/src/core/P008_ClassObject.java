package core;
class QQQ{
	public void call() {
		System.out.println("call in QQQ class");
	}
}
public class P008_ClassObject {
	public static void main(String[] args) {
		QQQ q = new QQQ();
		q.call();
		
	}
}
