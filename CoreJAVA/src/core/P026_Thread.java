package core;

class MyNewThread implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		t.setName("MyClass");
		System.out.println(t);

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(t + " i = " + i);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class MyThread extends Thread{
	public void run() {
		Thread t = new Thread();
		t.setName("MyClass");
		System.out.println(t);

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(t + " i = " + i);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class P026_Thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t = new Thread();
		t.setName("MyTHread");
		System.out.println(t);

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(t + " i = " + i);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		MyThread t1 = new MyThread();
		t1.run();
		
		MyNewThread t2 = new MyNewThread();
		t2.run();
	}
}
