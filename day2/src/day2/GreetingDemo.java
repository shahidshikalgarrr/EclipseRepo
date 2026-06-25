package day2;


interface Greeting{
	void sayHello();
}
public class GreetingDemo {
	private class GreetingInnerImpl implements Greeting{    //CLASS INSIDE ANOTHER CLASS
		
		@Override
		public void sayHello() {
			System.out.println("Greeting Inner Impl");
		}
	}
	
	public void anotherDemo() {
		class GreetingNestedImpl implements Greeting{   //NESTED CLASS
			
			@Override
			public void sayHello() {
				System.out.println("Greeting Nested IMPL");
			}
		};
		new GreetingNestedImpl().sayHello();
	}
	
	public static void main(String args[]) {
		GreetingDemo demo = new GreetingDemo();
		Greeting g1 = demo.new GreetingInnerImpl();
		g1.sayHello();
		
		demo.anotherDemo();
		
	}
}
