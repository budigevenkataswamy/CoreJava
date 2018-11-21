/**
 * 
 */
package S1_25_3.Classes.SigletonClass;

import java.util.Vector;

/**
 * @author welcome
 *
 */
public class Singleton {

	/**
	 * @param args
	 * Singleton:means one,that means you can create only one instance of the class.
1.you have to create static instance of the object.
2.create a private constructor.
3.create a static method.
	 */
	public static void main(String[] args) {
		Abc obj1=Abc.getInstance();
		Abc obj2=Abc.getInstance();
		 

	}

}
class Abc{
	static Abc obj=new Abc();//static instance of the object.
	private Abc(){
		//create a private constructor.
	}
	public static Abc getInstance(){//create a static method.
		return obj;
	}
}




 class If2 
{
    static boolean b1, b2;
    public static void main(String [] args) 
    {
        int x = 0;
        if ( !b1 ) /* Line 7 */
        {
            if ( !b2 ) /* Line 9 */
            {
                b1 = true;
                x++;
                if ( 5 > 6 ) 
                {
                    x++;
                }
                if ( !b1 ) 
                    x = x + 10;
                else if ( b2 = true ) /* Line 19 */
                    x = x + 100;
                else if ( b1 | b2 ) /* Line 21 */
                    x = x + 1000;
            }
        }
        System.out.println(x);
    }
}

 