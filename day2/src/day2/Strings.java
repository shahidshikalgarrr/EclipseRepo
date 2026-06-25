package day2;

public class Strings {
	public static void main(String args[]) {
		String s1 = "hello";
		String s2 = new String("hello"); // allocates new memory in heap for this
		String s3 = "hello";
		
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		
//		s1 = s1 + " world";
//		System.out.println(s1);  //every time if the string is manipulated string class creates a new object and preserves its previous 
		
		String name = "John";
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(nameRegex));
		
		String cell = "9876543211";
		String cellRegex = "[6-9]{1}[0-9]{9}";
		System.out.println(cell.matches(cellRegex));
		
		String email = "abc_890A@gmail.com";
		String emailRegex =  "[A-Za-z0-9_.-]+@[A-Za-z0-9_.-]+$";
		System.out.println(email.matches(emailRegex));
	}
}
