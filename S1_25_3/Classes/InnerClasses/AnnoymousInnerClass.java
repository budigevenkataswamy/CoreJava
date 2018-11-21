package S1_25_3.Classes.InnerClasses;

public class AnnoymousInnerClass {

	public static void main(String[] args) {
		B obj=new B(){
			public void show(){
				System.out.println("hai venkat......");
			}
		};
		obj.show();
	}
}
	abstract class B{
		public abstract void show();
		/*public void show(){
			System.out.println("Hello......");
		}*/
	}

