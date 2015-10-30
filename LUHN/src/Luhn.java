
public class Luhn {
	
	
	
	public static void main(String args[]){
		
		System.out.println("Hello World!");
		Luhn luhn = new Luhn();
		luhn.valid("44321");
	}

	public boolean valid(String num) {
		return (dat(num, 0) + 2*dat(num, 1) + dat(num, 2) + 2*dat(num, 3) + dat(num, 4)) % 10 == 0;
	}

	private int dat(String num, int index) {
		return new Integer((num.substring(index, index + 1))).intValue();
	} 
	
	
}



