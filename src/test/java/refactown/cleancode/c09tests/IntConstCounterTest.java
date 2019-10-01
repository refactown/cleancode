package refactown.cleancode.c09tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.List;

import org.junit.jupiter.api.Test;

class IntConstCounterTest {

	// Requirement 1 - count integer constants
	@Test
	void testV1() {
		assertEquals(1, IntConstCounterV1.countIntConstV1(Class1.class));
	}

	@Test
	void testV1AfterRefactoring() {
		assertEquals(1, IntConstCounterV1AfterRefactoring.countIntConstV1(Class1.class));
	}

	// Requirement 2 - excludes Enum, null and Abstract
	@Test
	void testV2() {
		assertEquals(1, IntConstCounterV2.countIntConstV2(Class1.class));
		
		assertEquals(-1, IntConstCounterV2.countIntConstV2(List.class)); // Abstract
		assertEquals(-1, IntConstCounterV2.countIntConstV2(Month.class));// Enum
		assertEquals(-1, IntConstCounterV2.countIntConstV2(null));// null
	}

	// Requirement 3 - inherited constants
	@Test
	void testV3() {
		assertEquals(1, IntConstCounterV3.countIntConstV3(Class1.class));
		
		assertEquals(-1, IntConstCounterV3.countIntConstV3(List.class)); // Abstract
		assertEquals(-1, IntConstCounterV3.countIntConstV3(Month.class));// Enum
		assertEquals(-1, IntConstCounterV3.countIntConstV3(null));// null
		
		assertEquals(3, IntConstCounterV3.countIntConstV3(Class2.class)); // 2 inherited consts
	}

}

class Class1{
	public static final int CONST1 = 1000;
}

class Class2 extends Class1{
	public static final int CONST2 = 2000;
	public static final int CONST3 = 3000;
}