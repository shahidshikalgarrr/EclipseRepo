package day2;

public class TestLibrary {
	public static void main(String[] args) {

		Book b1 = new Book("Harry Potter");

		Member m1 = new Member("Kim");

		Book b2 = new Book("Goosebumps");

		Member m2 = new Member("Pat");

		System.out.println("Issue Book:");

		try {
			b1.issueTo(m1);
			b2.issueTo(m1);

		} catch (BookException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		m1.returnBook();

		System.out.println("\nBook Status:");

		b1.status();
		b2.status();
	}
}