
public class Luhn {
	
	public boolean valid(String num) {
		int sum = 0;
		for (int i = 1; i < num.length() + 1; i++) {
			sum += f(i) * digitAt(num, i);
		}
		return sum % 10 == 0;
	}

	private int digitAt(String num, int index) {
		return new Integer((num.substring(index - 1, index))).intValue();
	} 
	
	private int f(int i) {
		if ((i % 2) == 0)
			return 2;
		else
			return 1;
	}
	
}



