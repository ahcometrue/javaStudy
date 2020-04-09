package com.hg.learn;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testFact() {
        assertEquals(1, User.fact(1));
        assertEquals(2, User.fact(2));
        assertEquals(6, User.fact(3));
        assertEquals(3628800, User.fact(10));
        assertEquals(2432902008176640000L, User.fact(20));
    }
}