package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());

        // Assert same (reference equality)
        String s1 = "hello";
        String s2 = s1;
        assertSame(s1, s2);

        // Assert not same
        String s3 = new String("hello");
        assertNotSame(s1, s3);

        // Assert arrays equal
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        // Assert double with delta (never use plain assertEquals for doubles)
        assertEquals(0.3, 0.1 + 0.2, 0.0001);
    }
}