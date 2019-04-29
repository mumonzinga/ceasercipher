
import org.junit.*;
import static org.junit.Assert.*;



import org.junit.*;
import java.util.ArrayList;
import java.util.List;


    public class Decode {
        private int approvedkey;
        private String encodedText;
        private String decodedText;


        public Decode(int key, String encryptedText, String decryptedText) {
            approvedkey = key;
            encodedText = encryptedText;
            decodedText = decryptedText;
        }

        public int getKey() {
            return approvedkey;
        }

        public String getEncryptedText() {
            return encodedText;
        }

        public String getDecryptedText() {
            return decodedText;
        }


        public static String decrypt(String encodedText, int approvedkey) {
            String decodedScript = "";
            String error = "";

            if (approvedkey < 1 || approvedkey > 26) {
                error = "key must be between 1 to 25";
            } else {
                for (int i = 0; i < encodedText.length(); i++) {
                    if (Character.isUpperCase(encodedText.charAt(i))) {
                        char ch = (char) (((int) encodedText.charAt(i) -
                                approvedkey));
                        if (ch < 'A') {
                            decodedScript += ((char) (encodedText.charAt(i) + (26 - approvedkey)));
                        } else {
                            decodedScript += (ch);
                        }
                    } else if (Character.isLowerCase(encodedText.charAt(i))) {
                        char ch = (char) (((int) encodedText.charAt(i) -
                                approvedkey));
                        if (ch < 'a') {
                            decodedScript += ((char) (encodedText.charAt(i) + (26 - approvedkey)));
                        } else {
                            decodedScript += (ch);
                        }

                    } else {

                        char ch = encodedText.charAt(i);

                        decodedScript += (ch);
                    }

                }
                return decodedScript;
            }
            return error;
        }
    }








