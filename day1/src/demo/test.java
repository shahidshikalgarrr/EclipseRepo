package demo;

public class test {

	test(){
		System.out.println("Constructer called");
	}
	
	public void display() {
		System.out.println("This is the display method");
	}
}

class Main {
	public static void main(String args[])
	{
	test a = new test();
	test b = new B();
	b.display();
	
	}
}
