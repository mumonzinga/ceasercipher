
import org.junit.*;



import static junit.framework.TestCase.assertEquals;


public class DecodeTest {

    @Test
    public void newDecode_getDecryptedText_pear() {
        Decode testDecode = new Decode(1, "qfbs", "pear");
        assertEquals("qfbs", testDecode.getDecryptedText());
    }
}