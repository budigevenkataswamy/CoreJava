package S11_01_06;

import S4_10_4.Multithreading.ByExtendingThreadClass.MyThread;

public class Demo1 {
	public static void main(String[] args)
	{
		
		MyThread t=new MyThread();
		t.start();
		for(char c='a';c<='j';c++);
		{
			char[] c = null;
			System.out.println(c);
			try{Thread.sleep(300);}catch(Exception e){}
		}
				
		
		System.out.println("main ends");
		}
}
