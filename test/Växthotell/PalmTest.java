package Växthotell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm p1 = new Palm("Laura", 5);

    @Test
    void setMängdVätska() {
        assert(p1.getMängdVätska() == 2.5);
        assert(p1.getMängdVätska() != 0.5);
    }

    @Test
    void testToString() {
        assert(p1.toString().equals("Laura ska få 2.5 liter kranvatten"));
        assert (!p1.toString().equals("Laura får inget kranvatten"));
    }
}