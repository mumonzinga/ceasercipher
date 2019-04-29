package main.java.Ceaser;
import org.junit.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {

    @Test
    public void newEncode_getDecryptedText_pear() {
        Encode testEncode = new Encode(1, "qfbs", "pear", 1);
        assertEquals("qfbs", testEncode.getDecryptedText());
    }
}