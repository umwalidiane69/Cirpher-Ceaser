import org.junit.*;
import java.util.*;
//import java.util.Scanner;
public class CirpherTest {
    public static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String plainText, int shiftKey) {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            char replaceVal = plainText.charAt(i);
            int charPosition = ALPHABET.indexOf(replaceVal);
            if (charPosition != -1) {
                int keyVal = (shiftKey + charPosition) % 26;
                replaceVal = ALPHABET.charAt(keyVal);
            }

            cipherText += replaceVal;
        }
        return cipherText;
    }public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            char replaceVal = cipherText.charAt(i);
            int charPosition = ALPHABET.indexOf(replaceVal);
            if(charPosition != -1) {
                int keyVal = (charPosition - shiftKey) % 26;
                if (keyVal < 0) {
                    keyVal = ALPHABET.length() + keyVal;
                }
                replaceVal = ALPHABET.charAt(keyVal);
            }
            plainText += replaceVal;
        }
        return plainText;
    }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.nextLine();
        System.out.println(encrypt(message, 3));
        System.out.println(decrypt(encrypt(message, 3), 3));
    }
}

//import static org.junit.Assert.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CirpherTest {
//    @Test
//    public void runCirpher_alphabet_ArrayList(){
//        Cirpher testCirpher = new Cirpher();
//        List<Object> expectedOutput = new ArrayList<Object>
//                ();
//        expectedOutput.add("a");
//        assertEquals(expectedOutput, testCirpher.runCirpher("a"));
//    }
//
//    @Test
//    public void runCirpher_countUpLastAlphabet_ArrayList() throws Exception {
//        Cirpher testCirpher = new Cirpher();
//        ArrayList<Object> expectedOutput = new ArrayList<Object>();
//        expectedOutput.add("a");
//        expectedOutput.add("b");
//
//        assertEquals(expectedOutput, testCirpher.runCirpher("b"));
//    }

//}