package S1_25_3.Classes.InnerClasses;

public class LambdaExpression {

	public static void main(String[] args) {
		BB obj=()->{System.out.println("heloo....");};
	 

	}

}
@FunctionalInterface
interface BB{
	void show();
}
