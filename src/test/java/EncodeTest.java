
import org.junit.Assert;



import static junit.framework.TestCase.assertEquals;
import org.junit.Test;


class EncodeTest {

    @Test
    public void newEncode_encrypt_testLetterEncryption_I_encryptsCorrectly() {
        Encode testEncode = new Encode(1, "I", "H", 1);
        assertEquals("H", testEncode.encrypt("H", 1));
    }

    @Test
    public void newEncode_getEncryptedText_qfbs() {
        Encode testEncode = new Encode(1, "qfbs", "pear", 1);
        assertEquals("pear", testEncode.getEncryptedText());
    }

    @Test
    public void newEncode_getDecryptedText_pear() {
        Encode testEncode = new Encode(1, "qfbs", "pear", 1);
        assertEquals("qfbs", testEncode.getDecryptedText());
    }

    @Test
    public void newEncode_getLatchkey_2() {
        Encode testEncode = new Encode(2, "rgct", "pear", 2);
        assertEquals(2, testEncode.getLatchkey());
    }

    @Test
    public void newEncode_encrypt_testSentenceEncryption_QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD() {
        Encode testEncode = new Encode(0, "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23);
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", testEncode.getEncryptedText());
    }

    @Test
    public void newEncode_encrypt_testOtherCharacterEncryption_bcd25() {
        Encode testEncode = new Encode(0, "bcd25!", "abc25!", 1);
        assertEquals("abc25!", testEncode.getEncryptedText());
    }

    @Test
    public void newEncode_encrypt_testLetterCase_NbNb() {
        Encode testEncode = new Encode(0, "NbNb", "MaMa", 1);
        assertEquals("MaMa", testEncode.getEncryptedText());
    }
}