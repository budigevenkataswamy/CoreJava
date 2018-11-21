package S4_10_4.Multithreading.ByExtendingThreadClass;

public class Test1 {
		public void main(String[] args) {
			System.out.println("main starts");
			Thread t1=new MyThread1();
			t1.start();
			for(int i=1;i<=10;i++);
					{
						System.out.println("main");
						try{}catch(Exception e){}
					}
					System.out.println("main ends");
					
		}
	}

