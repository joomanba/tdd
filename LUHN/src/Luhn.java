
public class Luhn {
	
	public boolean valid(String num) {
		return (f(1)*digitAt(num, 1) + f(2)*digitAt(num, 2) + f(3)*digitAt(num, 3) + 
				f(4)*digitAt(num, 4) + f(5)*digitAt(num, 5)) % 10 == 0;
	}

	private int digitAt(String num, int index) {
		return new Integer((num.substring(index -1, index))).intValue();
	} 
	
	private int f(int i) {
		if ((i % 2) == 0)
			return 2;
		else
			return 1;
	}
	
}



