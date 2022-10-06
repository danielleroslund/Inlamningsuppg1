package Växthotell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxtTest {

    KöttätandeVäxt kv1 = new KöttätandeVäxt("Meatloaf", 0.7);

    @Test
    void setMängdVätska() {
        assert (kv1.getMängdVätska() == 0.24);
        assert (kv1.getMängdVätska() != 24);
    }

    @Test
    void testToString() {
        assert (kv1.toString().equals("Meatloaf ska få 0.24 liter proteindryck"));
        assert (!kv1.toString().equals("Meatloaf får ingen proteindryck"));
    }
}