
import org.junit.*;



import static junit.framework.TestCase.assertEquals;


public class DecodeTest {

    @Test
    public void newDecode_getDecryptedText_pear() {
        Decode testDecode = new Decode(2, "rgct", "pear");
        assertEquals("pear", testDecode.getDecryptedText());
    }
}