import org.junit.*;
import java.util.*;
//import java.util.Scanner;
public class CirpherTest {
    public static String alphabet= "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String Text, int shiftKey) {
        Text = Text.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < Text.length(); i++) {
            char replaceVal = Text.charAt(i);
            int charPosition = alphabet.indexOf(replaceVal);
            if (charPosition != -1) {
                int keyVal = (shiftKey + charPosition) % 26;
                replaceVal = alphabet.charAt(keyVal);
            }

            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.nextLine();
        System.out.println(encrypt(message, 3));
        System.out.println("The String for Decryption: ");
        System.out.println(CeaserTest.decrypt(encrypt(message, 3), 3));
    }
}

