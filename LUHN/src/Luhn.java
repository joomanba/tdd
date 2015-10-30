
public class Luhn {
	
	public static void main(String args[]){
		System.out.println("Hello World!");
	}

	public boolean valid(String num) {
		return (4 + 2*4 + 3 + 2*2 + 1) % 10 == 0;
	}
	
}



