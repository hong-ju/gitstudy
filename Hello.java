package gittest;

public class Hello {

	public static void main(String[] args) {
		hello();
		helloName("man");
		helloName("Sexy guy");
		
	}
	public static void hello() {
		System.out.println("Hello k");
	}
	public static void helloName(String name) {
		System.out.println("Hello " + name);
	}
	
	
}
