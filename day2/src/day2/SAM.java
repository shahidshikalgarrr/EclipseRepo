package day2;

public class SAM<T> {
	private T data;
	
	public SAM(T data) {
		this.data = data;
	}
	
	public T getdata() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String args[]) {
//		SAM S = new SAM("Hola");
//		System.out.println(S.getdata());
//		
//		SAM S1 = new SAM(3.142);
//		System.out.println(S1.getdata());
//		
//		SAM S2 = new SAM(new Person("Kim", 22));
//		System.out.println(S2.getdata());
		
		SAM<String> S = new SAM<String>("hello");
		System.out.println(S.getdata());		
	}	
}
