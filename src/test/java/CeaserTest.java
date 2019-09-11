import java.util.*;

public class CeaserTest {

    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            char replaceVal = cipherText.charAt(i);
            int charPosition = alphabet.indexOf(replaceVal);
            if(charPosition != -1) {
                int keyVal = (charPosition - shiftKey) % 26;
                if (keyVal < 0) {
                    keyVal = alphabet.length() + keyVal;
                }
                replaceVal = alphabet.charAt(keyVal);
            }
            plainText += replaceVal;
        }
        return plainText;
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String message = new String();
//        message = sc.nextLine();
////       System.out.println("Enter the String for Decryption: ");
//        System.out.println(decrypt(CirpherTest.encrypt(message, 3), 3));
//    }
}