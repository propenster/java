package StudentPackage.dev.java.propenster;
import java.time.LocalDate;

abstract class AbstractClass{
	
	public abstract void greetUser();

	public void printDetails(){
		System.out.println("klsakllkdklasklaklslkdkaskalskdksd");
	}
}

class TestClass1 extends AbstractClass{
	public void greetUser(){
		System.out.println("Greet User..a..lalslk");
	}
	public void printDetails(){
		System.out.println("Wwleoemallsk askldlk a");
	}

}
	class MainClass{
	public static void main(String[] args) {
		TestClass1 tsc1 = new TestClass1();
		tsc1.greetUser();
		tsc1.printDetails();

	}
}
