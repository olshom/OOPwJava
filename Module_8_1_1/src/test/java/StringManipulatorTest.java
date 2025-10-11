import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void concatenate() {
        assertEquals("testtest", StringManipulator.concatenate("test", "test"));
    }

    @Test
    void findLength() {
        assertEquals(4, StringManipulator.findLength("test"));
    }

    @Test
    void convertToUpperCase() {
        assertEquals("TEST", StringManipulator.convertToUpperCase("test"));
    }

    @Test
    void convertToLowerCase() {
        assertEquals("test", StringManipulator.convertToLowerCase("TEST"));
    }

    @Test
    void containsSubstring() {
        assertTrue(StringManipulator.containsSubstring("test", "es"));
        assertFalse(StringManipulator.containsSubstring("test", "xyz"));
    }
}