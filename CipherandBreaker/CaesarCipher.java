import edu.duke.*;

public class CaesarCipher {
    private final String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
    
    public String encrypt (String input, int key) {
        String UpperLetterReplaced = replaceLetter (input, alphabetUpper, key);
        String LowerLetterReplaced = replaceLetter (UpperLetterReplaced, alphabetLower, key);
        return LowerLetterReplaced;
    }
    
    public String replaceLetter (String input, String alphabet, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String shiftedAlphabet = alphabet.substring(key)+
        alphabet.substring(0,key);
        for(int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if(idx != -1){
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }
    
    public String encryptTwoKeys (String input, int key1, int key2) {
        String UpperLetterReplaced = replaceLetterTwoKeys (input, alphabetUpper, key1, key2);
        String LowerLetterReplaced = replaceLetterTwoKeys (UpperLetterReplaced, alphabetLower, key1, key2);
        return LowerLetterReplaced;
    }
    
    public String replaceLetterTwoKeys (String input, String alphabet, int key1, int key2) {
        StringBuilder encrypted = new StringBuilder(input);
        String shiftedAlphabet1 = alphabet.substring(key1)+
        alphabet.substring(0,key1);
        String shiftedAlphabet2 = alphabet.substring(key2)+
        alphabet.substring(0,key2);
        for(int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if (idx != -1 && i%2==0) {
                char newChar = shiftedAlphabet1.charAt(idx);
                encrypted.setCharAt(i, newChar);
                
            } else if (idx != -1 && i%2!=0) {
                char newChar = shiftedAlphabet2.charAt(idx);
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }
    
    public void testCaesar() {
        FileResource fr = new FileResource();
        String message = fr.asString();
        int key = 15;
        String encrypted1 = encrypt(message, key);
        System.out.println(message + "\n" + encrypted1);

        String encrypted2 = encryptTwoKeys(message, 8, 21);
        System.out.println("\n" + encrypted2);

        String decrypted = encrypt(encrypted1, 26-key);
        System.out.println(decrypted);
    }
}

