package refactown.cleancode.c01cleancode;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountIntConstTest {

    @Test
    void testBadCode() {
        assertEquals(-1, BadCode.constants(null));
        assertEquals(-1, BadCode.constants(List.class));
        assertEquals(-1, BadCode.constants(Month.class));
        assertEquals(0, BadCode.constants(Object.class));
        assertEquals(4, BadCode.constants(ArrayList.class));
    }

    @Test
    void testrefactoring1() {
        assertEquals(-1, Refactoring1.countIntConstants(null));
        assertEquals(-1, Refactoring1.countIntConstants(List.class));
        assertEquals(-1, Refactoring1.countIntConstants(Month.class));
        assertEquals(0, Refactoring1.countIntConstants(Object.class));
        assertEquals(4, Refactoring1.countIntConstants(ArrayList.class));
    }

    @Test
    void testrefactoring2() {
        assertEquals(-1, Refactoring2.countIntegerConstants(null));
        assertEquals(-1, Refactoring2.countIntegerConstants(List.class));
        assertEquals(-1, Refactoring2.countIntegerConstants(Month.class));
        assertEquals(0, Refactoring2.countIntegerConstants(Object.class));
        assertEquals(4, Refactoring2.countIntegerConstants(ArrayList.class)); // java = 4
    }

}