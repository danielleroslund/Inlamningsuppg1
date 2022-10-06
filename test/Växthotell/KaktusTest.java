package Växthotell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    Kaktus k1 = new Kaktus("Igge", 0.2);

    @Test
    void setMängdVätska() {
        assert (k1.getMängdVätska() == 0.02);
        assert (k1.getMängdVätska() != 0.2);
    }

    @Test
    void testToString() {
        assert (k1.toString().equals("Igge ska få 0.02 liter mineralvatten"));
        assert (!k1.toString().equals("Igge ska inte få mineralvatten"));
    }
}