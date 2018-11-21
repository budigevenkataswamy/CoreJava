package S2_28_3.Classes.FinalClass;

/*
 * Here we have created a Final class. Now if any class will try to extend final class compiler will give error.
 * 
 * Un-commenting below code will give error 
 * 
 * "The type JBT_CreateFinalClass cannot subclass the final class FinalClass"
 */
 
public class JBT_CreateFinalClass // extends FinalClass
{
 
 public static void main(String[] args) {
 System.out
 .println("Object of final class can be created in the same way as other non-final class. Using New keyword.");
 
 FinalClass finObject = new FinalClass();
 
 }
}
 
/*
 * Creating a final class. Which can not be extended. Neither its method can be
 * overridden
 */
final class FinalClass {
 // Constructor of Final class
 FinalClass(){
 System.out.println("Inside Constructor of Final class");
 }
 
 /*
 *  Below Method can not be overriden by any class so behaviour of this
 *   method will be same in all scenario.
 *   
 *   Note*: Use of final keyword is not required still it will not create any problem.
 */
 
final void method() {
 System.out.println("Inside Method in Final Class");
 }
}
