package dev.java.propenster;

public class Methods{
	
	//Declare a public method which has no return type
	// and always receives a "name" parameter of type "String"
	public void Greet(String name)
		{
			System.out.println("Hello ", name);			
		}

	//Now a Static Method...
	public static void readMenu(){
		System.out.println("Menu....");
		System.out.println("=====================");
		System.out.println("1. Book A Ticket\t2. See Settings\n3. Withdraw\t4. Deposit");

	}

	//Now Let's see methods that have a return type i.e. that returns a value
	//A Method to multiply two numbers that are passed as arguments...
	public int Multiply(int x, int y){
		return x*y;
	}	

	//Let's see another....
	public int Add(int x, int y){
		return x+y;
	}

	/*
		Methods can also be overloaded....
		They can receive a varying number of arguments... 
		THis is an attribute and possible due to the Polymorphic 
		nature of JAVA....
		Let's change the Multipy and Add methods above to be overloaded..
	*/
	//Can you see the same 'Multiply' method but this time accomodating 
	// 3 arguments instead of two in  the former example...?	
	public int Multipy(int x, int y, int y){
			return x*y*z;
	}

	//Now the add
	public int Add(int x, int y, int z){
		return x+y+z;
	}

	//Now What if the user supplied decimal numbers (fractions)?
	//Can our program be extended to handle this anomally
	public double Multiply(double x, double y){
		return x*y;
	}

	public double Add(doublel x, double y){
		return x+y;
	}


	public static void main(String[] args){

		/*
		Methods are block of codes that run whenever they are called
		Method can be no-args (that is no arguments or parameters needed for
		it to be called
		) OR
		They can be methods that accept arguments when called.... e.g. PrintName("Faith")

		A very familiar example of method is this Main Method in this class...
		Actually Main Method is the entry point of all Java progrms. in other words..
		a java program without a main method cannot run...

		And the Main method is a static or class-wide method... i.e accessible in the class where
		it's created without the need to declare an object of that class
		Called Directly in the class in simple termsss


		*/

		//see how this readMenu() method will be called directly...
		readMenu();
		//However, Greet cannot be called like that, we have to access it 
		//through an object of the Methods class
		//Like the below

		Methods newObject = new();
		newObject.Greet("David");
		//It prints to the screen "Hello David"

		//Call the Multiply and Add methods..
		newObject.Multiply(25, 4);
		//You should get 100 printed as result of 25 x 4

		//Add method....
		newObject.Add(129, 150);

		public void Greet(){
			System.out.println("Hello! Welcome to Subaru.");
		}
		//To call this method...
		Greet();


		//Let's demonstrate our Method overloading herre
		//using the same newObject created from our Methods Class...

		newObject.Multiply(2,3,4); // prints 24

		newObject.Add(12,34,55) // prints the result of adding the 3 numbers

		//If the user supplies floating point / decimal numbers..
		newObject.Multiply(2.5, 10.5);
		//Add
		newObject.Add(123.4949, 23333.3838);

		//By this Polymorphic manipulation, we have made our program 
		//smarter in identifying various user-supplied inputs...

	}
}