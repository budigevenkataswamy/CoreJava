package S2_28_3.Classes.AbstractClass;

public class AbstractionDemo extends Abc implements BCD{
	public void m3(){
		System.out.println("this is the m3() method");
	}
	void m2(){
		System.out.println("this is the m2() method");
	}
	public static void main(String[] args) {
		BCD obj1;//reference to hold its implementation class
		Abc obj2;//Reference to hold its subclass object
		
		obj1=new AbstractionDemo();
		obj2=new AbstractionDemo();
		
		obj1.m3();
		obj2.m1();
		obj2.m2();
		
	}
}