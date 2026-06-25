package day2;

public class SUB_SAM<T, P> extends SAM<T> {
	
	private P temp;
	
	public SUB_SAM(T data, P temp) {
		super(data);
		this.temp = temp;			
	} 
	
	public P getTemp() {
		return temp;
	}
	
	public void setTemp(P temp) {
		this.temp = temp;
	}
	
	public static void main(String args[]) {
		SUB_SAM<String, Integer> S = new SUB_SAM<String, Integer>("John", 20);
		System.out.println(S.getdata() + "\t" + S.getTemp());
		
	}
	}
	
	
	
	

