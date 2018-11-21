package S4_10_4.myth;


public class MyThread1 extends Thread {
	public void run(){
		System.out.println("main starts");
}
		public void main(String[] args)
		{
			System.out.println("main starts");
			MyThread1 t1=new MyThread1();
			Thread t=new MyThread1();
			t.start();
			System.out.println("main ends");
			}

		}
