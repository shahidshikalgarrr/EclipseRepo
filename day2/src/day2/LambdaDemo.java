package day2;
@FunctionalInterface

interface Hello {
	String greet();
	
	default void demo() {
		System.out.println("Hello Demo" + temp());
	}
	
	static void test() {
		System.out.println("Hello test");
	}
	
	private String temp() {
		return "Hello Temp";		
	}
}

@FunctionalInterface
interface Printer{
	void Print(String name);
}
public class LambdaDemo {
	
	public static void main(String args[]) {
		Hello h1 = () -> "Hello Lambda";
		System.out.println(h1.greet());
						
		
		Hello h2 = () -> {
			String msg = "Bonjour Lambda";
			return msg;
		};
		System.out.println(h2.greet());
		
		Printer p1 = (name) -> System.out.println(name);
		p1.Print("John");
		
		Printer p2  = System.out::println;  //pass the print output to the println 
		p2.Print("Amazing");
		
		
	}
}
