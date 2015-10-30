import static org.junit.Assert.*;

import org.junit.Test;

public class LuhnTest {

	@Test
	public void testLuhn() {
		Luhn luhn = new Luhn();
		assertTrue(luhn.valid("49321") == true);
	}

}