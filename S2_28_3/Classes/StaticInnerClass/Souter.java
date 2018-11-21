package S2_28_3.Classes.StaticInnerClass;
/*=>we can create object of static inner class with in the outer class directly
 * =>we can write both the static and non static data with in the static inner class
 * =>we can also write main method in static inner class 
 * =>we can execute the static &non static inner classes separately.
 * while executing the outer class,inner class is not loading,in the same manner while executing 
 * the inner classes outer class is not loaded
 * */

public class Souter {
	int a=333;
	static int b=444;
	
	static class Sinner{
		int a=111;
		static int b=222;
		
		void m1(){
			System.out.println("sinner class m1 method");
		}
		void m2(){
			System.out.println("sinner class m2 method");
		}
	}
	 

void m1(){
	System.out.println("souter class m1");
}
void m2(){
	System.out.println("souter class m2 method");
}
public static void main(String[] args) {
	
		System.out.println("sinner class main method");
		Sinner si=new Sinner();	
		System.out.println(si.a);
		System.out.println(si.b);
		si.m1();
		si.m2();
	System.out.println("souter class main method");
	Souter so=new Souter();
	System.out.println(so.a);
	System.out.println(b);
	so.m1();
	so.m2();
}
}


