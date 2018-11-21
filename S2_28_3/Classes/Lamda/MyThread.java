package S2_28_3.Classes.Lamda;

public class MyThread {

	public static void main(String[] args) {
Runnable r=new Runnable(){
	public void run(){
		System.out.println("runnable run method");
	}
};
Thread t1=new Thread(r);
t1.start();
Runnable r1=()->{
	System.out.println("Lamda expression");
	System.out.println("lamda");
};
new Thread(r1).start();
	}

}
