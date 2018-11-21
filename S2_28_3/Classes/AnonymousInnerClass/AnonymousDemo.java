package S2_28_3.Classes.AnonymousInnerClass;

public class AnonymousDemo {
public void run(){
	System.out.println("this is the run method...");
}
public static void main(String[] args) {
	AnonymousDemo ad =new AnonymousDemo();
	
	Thread t= new Thread(){
		public void run(){
			System.out.println("this is an anonymous method");
		}
	};
	//t.start();
	Runnable r=new Runnable(){
		public void run(){
			System.out.println("runnable run method");
		}
	};
Thread t1=new Thread(r);
t1.start();
}
}
