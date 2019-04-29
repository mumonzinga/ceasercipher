
import java.lang.*;
import java.util.Scanner;
import java.lang.String;

import org.junit.*;
import static org.junit.Assert.*;



import org.junit.*;
import java.util.ArrayList;
import java.util.List;





public class App {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("╔╗╔╦═╦═╦═╦╦╗ ╔╦╦╦═╦═╦╦╦═╦═╦═╗\n" +
                "║╚╝║║║║║║║║║ ║║║║═╣═╣╔╣═╣║║║║\n" +
                "║╔╗║╦║╔╣╔╣╗║ ║║║║═╣═╣╚╣═╣║║║║\n" +
                "╚╝╚╩╩╩╩╩╝╚═╝ ╚══╩═╩═╩╩╩═╩╩╩═╝\n"
        );
        System.out.println(" ");
        System.out.println("\n" +
                " የእኔ ቄሣር ሳይፈር ትግበራ አቀባበል  \n" +
                "welcome to my ceaser cipher application \n" +
                "~amharic~ \n");

        System.out.println(" ");
        System.out.println("Do you want to encrypt, decrypt or quit?");
        String request = myScanner.nextLine();

        if (request.equalsIgnoreCase("encrypt")) {
            System.out.println("Enter text to encrypt");
            String encodedText = myScanner.nextLine();
            System.out.println("Enter your approved shift key");
            int key = myScanner.nextInt();
            Encode  ceaser = new Encode("qfbs", "pear", 2);

            String encodedScript = ceaser.encrypt (encodedText, key);

            System.out.println("Here is your Encrypted/encoded script");
            System.out.println(encodedScript);
            System.out.println("-------------------------------------------");

        } else if (request.equalsIgnoreCase("decrypt")) {
            System.out.println("Enter text to decrypt");
            String decodedText = myScanner.nextLine();
            System.out.println("Enter your approved shift key");
            int key = myScanner.nextInt();
            Decode  cipher = new  Decode(2, "qfbs", "pear");
            String decodedScript = cipher.decrypt(decodedText, key);
            System.out.println("Here is your Decrypted/decoded script");
            System.out.println(decodedScript);
            System.out.println("-------------------------------------------");

        } else  if (request.equalsIgnoreCase("quit")) {
            System.out.println("Ending the application ... ");
            System.exit(0);

        } else {
            System.out.println("Invalid request, please choose encrypt or decrypt");


        }

    }
}