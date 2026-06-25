package day2;

public class Person implements Cloneable{
	
	private String name;
	private int age;
	
	public Person() {	//calling another constructor on the same object, constructor chaining
		this("Anonymous", -1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name: " + name + ", Age: "+ age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person P = (Person) obj;
			if(this.age == P.age && name.equals(P.name)) 
				return true;
			}
		return false;
		
	}

	public static void main(String args[]) throws CloneNotSupportedException {
		Person P = new Person("John", 21);
		P.print();
		Person p = new Person();
		p.print();
		
		System.out.println(P.hashCode()); //hashcode for object 1
		
		System.out.println(P);
		
		System.out.println(P.equals(p)); // compares hash code and will return false
		
		Person PC = (Person) P.clone();
		System.out.print(PC);
		
		
	}
}
