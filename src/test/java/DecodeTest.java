
import org.junit.*;



import static junit.framework.TestCase.assertEquals;


public class DecodeTest {

    @Test
    public void newEncode_getDecryptedText_pear() {
        Encode testEncode = new Encode("qfbs", "pear", 1);
        assertEquals("qfbs", testEncode.getDecryptedText());
    }
}