package S2_28_3.Classes.SuperSubClass;
/*
 * Super classes and subclasses – Java Tutorial

When you are using superclasses and subclasses,
 it is important to remember that two constructors execute. 
 The base, or parent, class constructor MUST execute prior to the extended, 
 or child, class constructor.*/

public class DemoConstructors
{
// The main method that executes both programs
public static void main(String[] args)
{
ASubClass child = new ASubClass();
}
}