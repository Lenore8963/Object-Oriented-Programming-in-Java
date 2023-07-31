import edu.duke.*;

public class TestCaesarCipherTwo {
    
    private String halfOfString (String message, int start) {
        String newString ="";
        for (int i=0; (i+start) < message.length(); i=i+2) {
            newString += message.charAt(i+start);
        }
        return newString;
    }

    private int[] countLetters (String message) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for ( int k=0; k < message.length(); k++) {
            char ch = Character.toLowerCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if (dex !=-1) {
                counts[dex] +=1;
            }
        }
        return counts;
    }
    
    private int maxIndex (int[] vals) {
        int maxDex = 0;
        for (int k=0; k < vals.length; k++) {
            if (vals[k] > vals[maxDex]) {
                maxDex = k;
            }
        }
        return maxDex;
    }
    
    private int getKey (String s) {
        int[] freqs = countLetters(s);
        int maxDex = maxIndex (freqs);
        int dkey = maxDex - 4;
        if (maxDex < 4) {
            dkey = 26 - (4-maxDex);
        }
        return dkey;
    }
    
    public String breakCaesarCipher (String input) {
        String oddPart = halfOfString (input, 0);
        String evenPart = halfOfString (input, 1);
        int keyOdd = getKey(oddPart);
        int keyEven = getKey(evenPart);
        System.out.println("The two keys that were used to encrypt are: " + keyOdd + " and " + keyEven);
        CaesarCipherTwo cc = new CaesarCipherTwo(keyOdd, keyEven);
        return cc.decrypt (input);
    }

    public void simpleTests () {
        String phrase1 = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        CaesarCipherTwo cc1 = new CaesarCipherTwo(21, 8);
        String encrypted = cc1.encrypt(phrase1);
        System.out.println("Encrypted: \n" + encrypted);
        String phrase2 = "Hfs cpwewloj loks cd Hoto kyg Cyy.";
        CaesarCipherTwo cc2 = new CaesarCipherTwo(14, 24);
        String decrypted = cc2.decrypt(phrase2);
        System.out.println("Decrypted: \n" + decrypted);
        String phrase3 = "Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!";
        String decrypted2 = breakCaesarCipher (phrase3);
        System.out.println("Decrypted: \n" + decrypted2);
        FileResource fr = new FileResource();
        String contents = fr.asString();
        String decryptedAuto = breakCaesarCipher(contents);
        System.out.println("By decrypting automatically, we get: \n" + decryptedAuto);
    }
}
