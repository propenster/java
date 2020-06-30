package dev.java.propenster;


public class NestedClasses{

	int x = 0;

	public class InnerClass{
		int y = 5;
	}



public static void main(String[] args) {
	NestedClasses myOuterClass = new NestedClasses();
	NestedClasses.InnerClass myInnerClass = myOuterClass.new InnerClass();
	System.out.println(myInnerClass.y + myOuterClass.x);

	//If an inner class is declared with the 'private' access modifier,
	// it is not accessible from the Outer Class...
	// See the documentation for more details....

	//Now to declare a fresh 
	NestedClasses outer = new NestedClasses();
	NestedClasses.InnerClass inner = new NestedClasses.InnerClass();

	//The inner class could also be set as 'Static' thus making it callable
	//without initialisation...

	//Inner classes can access attributes and methods of the outer class...
	OuterClass outers = new OuterClass();
	OuterClass.InnerClass inners = outers.new InnerClas();

}



}