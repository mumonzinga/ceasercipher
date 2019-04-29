
import org.junit.*;



import static junit.framework.TestCase.assertEquals;


class DecodeTest {

    @Test
    public void newEncode_getDecryptedText_pear() {
        Encode testEncode = new Encode(1, "qfbs", "pear", 1);
        assertEquals("qfbs", testEncode.getDecryptedText());
    }
}