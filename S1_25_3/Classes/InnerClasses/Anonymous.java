/**
 * 
 */
package S1_25_3.Classes.InnerClasses;

/**
 * @author welcome
 *
 */
public class Anonymous {

	public static void main(String[] args) {
		AB obj=new AB(){
			public void show(){
				System.out.println("Anonyous example......");
			}
			
		};
		obj.show();
		 

	}

}
 
	abstract class AB{
		public abstract void show();
		/*public void show(){
			System.out.println("Hello......");
		}*/
	}