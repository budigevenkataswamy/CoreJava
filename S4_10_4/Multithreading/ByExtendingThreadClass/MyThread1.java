package S4_10_4.Multithreading.ByExtendingThreadClass;

public class MyThread1 extends Thread {
	public int i;
	public void run(){
		System.out.println("run starts");
		for(int i=1;i<=10;i++);{
			System.out.println("child");
			try{}catch(Exception e){}
			System.out.println("run ends");
		}
			}
	
	 

}
