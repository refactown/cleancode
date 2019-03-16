package refactown.cleancode.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathTest {

	@Test
	public void testAdd() {
		System.out.println("Test Java");
		assertEquals(5,  Math.add(2, 3));
		assertEquals(5,  MathKt.add(2, 3));
	}

}
