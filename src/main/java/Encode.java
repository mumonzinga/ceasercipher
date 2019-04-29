
import java.lang.*;


public class Encode {
    private String encodedText;
    private String decodedText;
    private int index;

    public  Encode ( String encryptedText, String decryptedText, int latchkey) {
        encodedText =  encryptedText;
        decodedText = decryptedText;
        index = latchkey;
    }
    public String getEncryptedText() {
        return encodedText;
    }
    public String getDecryptedText() {
        return decodedText;
    }
    public int getLatchkey() {
        return index;
    }

    public static String encrypt(String text, int index)

    {

        String outcome= "";
        String error=" ";

        if (index < 1 || index > 26) {
            error = "key must be between 1 to 25";
        }else {

            for (int i = 0; i < text.length(); i++) {
                if (Character.isUpperCase(text.charAt(i))) {
                    char ch = (char) (((int) text.charAt(i) +
                            index));

                    if (ch > 'Z') {
                        outcome += ((char) (text.charAt(i) - (26 - index)));
                    } else {
                        outcome += (ch);
                    }

                } else if (Character.isLowerCase(text.charAt(i))) {
                    char ch = (char) (((int) text.charAt(i) +
                            index ));

                    if (ch > 'z') {
                        outcome += ((char) (text.charAt(i) - (26 - index)));
                    } else {
                        outcome += (ch);
                    }

                } else {

                    char ch = text.charAt(i);
                    outcome += (ch);

                }
            }
            return outcome;
        }

        return error;
    }

}