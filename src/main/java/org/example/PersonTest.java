package org.example;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PersonTest {

    @Test
    public void isNotTeenager() {
        boolean result = Person.isTeenager(12);
        assertFalse(result);

        result = Person.isTeenager(20);
        assertFalse(result);
    }
    @Test
    public void isTeenager() {
        boolean result = Person.isTeenager(13);
        assertTrue(result);

        result = Person.isTeenager(19);
        assertTrue(result);

        result = Person.isTeenager(16);
        assertTrue(result);

    }

}
