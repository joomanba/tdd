
public class Luhn {
	
	public boolean valid(String num) {
		int sum = 0;
		for (int i = 1; i < num.length() + 1; i++) {
			sum += doubleEverySecondDigit(i, num);
		}
		return sum % 10 == 0;
	}

	private int doubleEverySecondDigit(int i, String num) {
		if ((i % 2) == 0)
			return sumDigitsIfGreaterThan9(digitAt(num, i) * 2);
		else
			return digitAt(num, i);
		 
	}

	private int sumDigitsIfGreaterThan9(int num) {
		if (num > 9)
			return num - 10;
		else
			return num;
		
	}

	private int digitAt(String num, int index) {
		return new Integer((num.substring(index - 1, index))).intValue();
	} 
	
}



